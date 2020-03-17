<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
<head>
<style>
table td{font-family:verdana;font-size:12px;}
</style>
</head>
<body>
<font face="verdana" size="2">Welcome<b>${ifobj.user}</b>,<br>Validations Success..!<br><br>
<u>You Entered</u><br></font>
<table>
<tr><td>Email</td>
<td>${ifobj.email}</td></tr>
<tr><td>Phone</td>
<td>${ifobj.phone}</td></tr>
</table>
</body>
</html>