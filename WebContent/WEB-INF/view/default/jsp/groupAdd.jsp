 <%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>	
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<script>


function createCheckBox(x){
	
	$.ajax({
	    type:"GET",
	    url: "${contextURL}/GetStudentsBySubject",
	    data:{id:x},
	    cache: false,
	    success: function(result){
          //alert(result);   
	    $( "#students" ).html(result);
        }});
  
}
$( document ).ready(function() {
	
	$( "select[name='subject']" ).on('change', function() {
	
		var x=$("select[name='subject']").val();
	//alert($("select[name='subject']").val());
	//$( "select[name='teachers']" ).html("<option>ali</option><option>ahmed</option>");
	  $.ajax({
		    type:"GET",
		    url: "${contextURL}/GetTeachersBySubject",
		    data:{id:x},
		    cache: false,
		    success: function(result){
             // alert(result);   
		    	$( "select[name='teachers']" ).html(result);
		    	createCheckBox(x);
            }});
	  
	
	});
});


</script>

<form action="" method="get">
 <div>Subject</div>
 <select name="subject">
    <option value="null">Secin</option>
	<c:forEach items="${Subjects}" var="data">
   		<option value="${data.key}">${data.value}</option>
	</c:forEach>	
 </select><br/>
 <div>Teachers</div> 
 <select name="teachers">
 	
 </select>
 <div id="students"></div> 
 
<input type="submit" name="ok" value="ok"/>

 
 
 

</form>



		
