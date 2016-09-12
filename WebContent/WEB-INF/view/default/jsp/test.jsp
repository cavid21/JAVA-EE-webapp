<!DOCTYPE HTML PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html xmlns="http://www.w3.org/1999/xhtml">

<script>
var x=1;
var maxItem=6;
function sayHi(x){
	var name="Inar";
	if (x>5)  name="Miryusif";
	alert("salam "+name);
	
}

function calc(){
var c=$("#a").val()+$("#b").val();
	//alert( $("#a").val());
	$("#c").val(c) ;
}

function  switchOff(){
for (i=1;i<=maxItem;i++)
	{
	$("#item"+i).css("display","none");
	}
} 


function  switchOn(y){

	$("#item"+y).css("display","block");
	
	
}
function kimyatmiwkimoyaq(){
	
	switchOff();
	switchOn(x);

}
$( document ).ready(function() {
//	alert($("#item1").html());
	//$("#item1").css("display","block");
	kimyatmiwkimoyaq();
	
	//alert($("input[name='next']").attr("disabled",true));
	$( "input[name='next']" ).click(function() {
		if (x<maxItem)  x++;
		else            //x=1;
			$("input[name='next']").attr("disabled",true);
		kimyatmiwkimoyaq();
		});
	
	$( "input[name='prev']" ).click(function() {
		if (x>1)        x--;
		else            //x=maxItem;
			$("input[name='prev']").attr("disabled",true);
		kimyatmiwkimoyaq();
		});
	
	
	
	
	$( "input[name='ok']" ).click(function() {
	
		
		//alert($("input[name='id']").val());
	$.ajax({
		    type:"GET",
		    url: "GetNameByID",
		    data:{id:$("input[name='id']").val()},
		    cache: false,
		    success: function(result){
             //  alert(result);   
		    	$("#rs").html(result); 
            }});
	
	
	});
});


</script>

<input type="button" name="prev" value="pr"  />
<input type="button" name="next" value="next111"  />
<div id="item1" >item1wwwwwwwwwwwwwwwwwww</div>
<div id="item2">item2wwwwwwwwwwwwwwwwwww</div>
<div id="item3">item3wwwwwwwwwwww
sdgkfgkgs
sdgsdgsdg
<hr/>wwwwwww</div>

<div id="item4">item4wwnextwwwwwwwwwwwwwwww</div>
<div id="item5">item5wwwwwwwwwwwwwwwwww</div>
<div id="item6">item6wwwwwwwwwwwwwwwwwww</div>



<input type="text" name="id" value="3"/>
<input type="button" name="ok" value="tap"/>




<div id="rs">.....</div>





