 <%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>	
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>


 <h3>Student Info</h3>
 
 <table border=1  width="90%" >

    <tr>
         <th> ID </th>
	     <th> name </th>
		 <th> surname </th>
		 <th> firstname </th>
		 <th> activity </th>
		 <th> about </th>
		 <th> email </th>
		 <th> phone </th>
		 <th> birthday </th>
		 <th> city </th>
	</tr>
 	<tr>
 	    <td>${Student.id}</td>
 	    <td>${Student.name}</td>
        <td>${Student.surname}</td>
        <td>${Student.firstname}</td>
        <td>${Student.activity}</td>
        <td>${Student.about}</td>
        <td>${Student.email}</td>
        <td>${Student.phone}</td>
        <td>${Student.birthday}</td>
        <td>${Student.city}</td>

	
	</tr> 


</table>

		
