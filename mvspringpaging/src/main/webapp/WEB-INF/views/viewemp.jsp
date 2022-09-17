<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>      
<!DOCTYPE html">  
<html>  
<body>  
<h1>Employees List</h1>    
<table border="1" width="90%" cellpadding="2">    
<tr><th>Employee No</th><th>First Name</th><th>Eamil</th><th>Extension</th><th>Title</th></tr>    
   <c:forEach var="emp" items="${msg}">     
   <tr>    
   <td>${emp.employeeNumber}</td>    
   <td>${emp.firstName}</td>    
   <td>${emp.email}</td>    
   <td>${emp.extension}</td>    
   <td>${emp.jobTitle}</td>
   </tr>    
   </c:forEach>    
   </table>    
   <br/>    
   <a href="/mvspringpaging/viewemp/1">1</a>     
   <a href="/mvspringpaging/viewemp/2">2</a>     
   <a href="/mvspringpaging/viewemp/3">3</a>    
</body>  
</html>  
