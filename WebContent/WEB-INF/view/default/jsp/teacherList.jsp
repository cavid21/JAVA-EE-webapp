 <%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>	
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>




 
 
 <br/>
<table border=1  width="90%" >

    <tr>
         <th> ID </th>
	     <th> name </th>
		 <th> surname </th>
		 <th> firstname </th>
		 <th> subject </th>
		 <th> about </th>
		 <th> email </th>
		 <th> phone </th>
		 <th> birthday </th>
	</tr> 
	<c:forEach   items="${Teacher}" var="myTeacher">   
 	<tr>
 	    <td>${myTeacher.id}</td>
        <td>${myTeacher.name}</td>
        <td>${myTeacher.surname}</td>
        <td>${myTeacher.firstname}</td>
        <td>${myTeacher.subject}</td>
        <td>${myTeacher.about}</td>
        <td>${myTeacher.email}</td>
        <td>${myTeacher.phone}</td>
        <td>${myTeacher.birthday}</td>


	
	</tr> 
	</c:forEach>

</table>
<br/>



		
