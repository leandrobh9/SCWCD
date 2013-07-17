<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jstl/core" 
    prefix="c" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script src="http://code.jquery.com/jquery-1.10.1.min.js"></script>
<script src="http://www.malsup.com/jquery/block/jquery.blockUI.1.33.js"></script>

<script type="text/javascript">

function enumerate(o,s){

    //if s isn't defined, set it to an empty string
    s = typeof s !== 'undefined' ? s : "";

    //iterate across o, passing keys as k and values as v
    $.each(o, function(k,v){

        //if v has nested depth
        if(typeof v == "object"){

            //write the key to the console
            alert(s+k+": ");

            //recursively call enumerate on the nested properties
            enumerate(v,s+"  ");

        } else {

            //log the key & value
            alert(s+k+": "+v);
        }
    });
}

function chamadaJSON(){
	$.getJSON("http://localhost:8080/Axxiom/Principal", function(json){
		
		$.each(json, function(cont , obj){
			
			//var linha = "<tr>"; 
			//"<td>" + $(this).get(v) + "</td>" + 
			//"<td>" + this['nome'] + "</td>" +
			
			//$.each(this.attributes, function(){
				//linha += "<td>" + this + "</td>";
			//});
			
			//alert(this.attributes.length);
			enumerate(obj);
			
			//"</tr>";
			
			//$('#tabela').append(linha);
		});
	});
}

	function chamadaAjax(){
		
		callback = function (e){
			var objs = $.parseJSON(e);
			
			$.each(objs, function(){
				var idInput = "I" + this['id'];
				var linha = "<tr>" + 
				"<td>" + this['id'] + "</td>" + 
				"<td>" + this['nome'] + "</td>" +
				"<td>" + "<input id='" + idInput  + "' type='text' /></td>" + 
				"</tr>";
				$('#tabela').append(linha);
			});
		};
		$.ajax({
			  url: "http://localhost:8080/Axxiom/Principal",
			  context: document.body,
			  sucess: alert('sucess'),
			  complete: function(e){ 
				  var obj = $.parseJSON(e.responseText);
				  //alert(obj.id)
			  }
			}).always(callback);	
	}

</script>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Teste</title>
</head>
<body>
<c:out value="Teste1"></c:out>
<input type='submit' value='enviar' onclick='chamadaAjax(); return false;' />
<table id="tabela"></table>
</body>
</html>