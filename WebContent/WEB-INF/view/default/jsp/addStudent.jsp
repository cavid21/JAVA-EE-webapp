 <%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>	
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>




 
 <h3>AddStudent</h3>
<form action=""   method="get">


<div>  Name : </div>
<div><input type="text"   name="name"  size="40" /></div>  
<div>Surname : </div>
<div><input type="text"   name="surname"  size="40" /></div>
<div>Firstname :</div> 
<div><input type="text"   name="firstname" size="40" /></div>
<div> Activity : </div>
<div><select name="activity">
<option value="null"> All  </option>
<c:forEach  items="${Subjects}"  var="data">
<option  value="${data.key}"
<c:if test="${Filter.activity==data.key}">selected</c:if>


>${data.value} </option>

</c:forEach>
</select></div>
<div>  About : </div>
<div><textarea name="about" rows="4" cols="50">
</textarea> </div>
<div>  Email : </div>
<div><input type="text"   name="email"  size="40" /></div>
<div>  Phone : </div>
<div><input type="text"   name="phone"  size="40" /></div>
<div> Birthday : </div>
<div><input type="text" name="birthday"  size="40" />
</div>
<div>  City : </div>
<div><input type="text"   name="city"  size="40" /></div> 

<br>
<input type="submit" value="Add">

</form>




		
