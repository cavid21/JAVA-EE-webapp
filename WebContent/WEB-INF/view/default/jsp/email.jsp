<!DOCTYPE HTML PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html xmlns="http://www.w3.org/1999/xhtml">



<script>
	
	
$( document ).ready(function() {
	$( "input[name='add']" ).click(function() {
	$.ajax({
	    type:"GET",
	    url: "checkEmail",
	    data:{email:$("input[name='email']").val()},
	    cache: false,
	    success: function(result){
	    	
           alert(result);   
	     //$("#rs").html(result);
        }});
	


});
});



</script>

<input type="text" name="email"/>

<input type="submit" name="add" value="add"   />





