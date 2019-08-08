<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
    
   <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Success</title>
</head>
<body>

<table>
<tr>
<th>Doctor Id</th>
<th>Doctor Name</th>
<th>Specialization</th>
<th>Phone No.</th>
<th>Address</th>

</tr>
<tr>
<th>${command.doctorId}</th>
<th>${command.doctorName}</th>
<th>${command.specialization}</th>
<th>${command.phoneNumber}</th>
<th>${command.address.addressLine1} ${command.address.city} ${command.address.pinCode}</th>

</table>

</body>
</html>