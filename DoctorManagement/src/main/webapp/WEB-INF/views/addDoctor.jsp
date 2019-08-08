<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Doctor</title>
</head>
<body>

<form:form action="addDoctor" method="post">

<label>Doctor ID</label>
<form:input path="doctorId"/>

<label>Doctor Name</label>
<form:input path="doctorName"/>

<label>Specialization</label>
<form:select path="specialization" items="${depts}"/>

<label>Phone Number</label>
<form:input path="phoneNumber"/>

<label>Address</label>
<form:input path="address.addressLine1"/>

<label>City</label>
<form:input path="address.city"/>

<label>Pin Code</label>
<form:input path="address.pinCode"/>





<input type="submit" value="Add">
</form:form>
</body>
</html>