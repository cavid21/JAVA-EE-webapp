 <%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>	
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<!--  <script>

$( document ).ready(function() {
	
	$( "select[name='login']" ).on('click', function() {
	
		var x=$("select[name='user']").val();
		

	  $.ajax({
		    type:"GET",
		    url: "${contextURL}/GetTeachersBySubject",
		    data:{id:x},
		    cache: false,
		    success: function(result){
              alert(result); 
              alert(x);

            }}); 
	  
	
	});
});


</script> -->

<form action=""  method="get">
	<h3>Admin</h3>
	<div>Email : <input type="Text" name="email" /></div>
	<br/>
	<div>Password :<input type="Text" name="pass" /></div>
	<br/>
	<input type="submit" name="login" value="login"/>
</form>
<br/>
<br/>




		
