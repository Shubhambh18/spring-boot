package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.Alien;
import com.example.demo.repo.AlienRepo;

@Controller
public class AlienController {
	@Autowired
	AlienRepo repo;
	
	@RequestMapping("home")
	public String home() {
		System.out.println("Alien Controller");
		return "home.jsp";
	}
	
	@RequestMapping("getAlien")
		public ModelAndView getAlien(@RequestParam int aid) {
		
		ModelAndView mv= new ModelAndView("results.jsp");
		Alien alien = repo.findById(aid).orElse(new Alien());
		mv.addObject(alien);
//		System.out.println(repo.findBytname("java"));
		System.out.println(repo.findByCustomAid(101));
		return mv;
		
	}
	
	@RequestMapping("/addAlien")
	public String addAlien(Alien alien) {
		repo.save(alien);
		return "home.jsp";
	}
	

	@RequestMapping("/aliens")
	@ResponseBody
	public String getAllAliens(Alien alien) {
		return repo.findAll().toString();
	}
	
	@RequestMapping("/alien/{aid}")
	@ResponseBody
	public String getAlienCustom(@PathVariable("aid") int aid) {
		return repo.findById(aid).toString();
	}
	
}
