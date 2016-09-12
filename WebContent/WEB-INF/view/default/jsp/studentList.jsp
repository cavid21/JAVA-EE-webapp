 <%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>	
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<form action=""  method="get">
 <h3>Search</h3>
Name:<input type="Text" name="name" value="${Filter.name}"  / >
SurName:<input type="Text" name="surname"  value="${Filter.surname}"  / >
<select name="activity">
<option value="null"> All  </option>
<c:forEach  items="${Subjects}"  var="data">
<option  value="${data.key}"
<c:if test="${Filter.activity==data.key}">selected</c:if>


>${data.value} </option>

</c:forEach>
</select>
<input type="submit" value="search"  />

 </form>
 
 
 <br/>
 
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
	<c:forEach   items="${Student}" var="myStudent">   
 	<tr>
 	    <td><a href="studentInfo?id=${myStudent.id}">${myStudent.id}</a></td>
 	    <td>${myStudent.name}</td>
        <td>${myStudent.surname}</td>
        <td>${myStudent.firstname}</td>
        <td>${myStudent.activity}</td>
        <td>${myStudent.about}</td>
        <td>${myStudent.email}</td>
        <td>${myStudent.phone}</td>
        <td>${myStudent.birthday}</td>
        <td>${myStudent.city}</td>

	
	</tr> 
	</c:forEach>

</table>
<br/>




		
