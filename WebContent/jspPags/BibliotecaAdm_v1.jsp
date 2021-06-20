<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
<%@page import="br.com.ocio.piquisaweb.dao.GamesDAO" %>
<%@page import="br.com.ocio.piquisaweb.modelo.Games" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Games Sell Life</title>

<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="shortcut icon" type="imagem/png" href="../yinyang.png" />
<link rel="stylesheet" href="../novocss.css">
<link rel="stylesheet" href="../css/page4.css">
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Poppins">

<link rel="stylesheet" href="../css/font-awesome.css">
<link rel="stylesheet" href="../css/font-awesome.min.css">


<style>

body,h1,h2,h3,h4,h5 {font-family: "Poppins", sans-serif}
body {font-size:16px;}
.w3-half img{margin-bottom:-6px;margin-top:16px;opacity:0.8;cursor:pointer}
.w3-half img:hover{opacity:5}


</style>

<body
	style="background-image: url('../imagens/1.jpg'); background-size: cover; background-attachment: fixed; background-repeat: no-repeat;">

	<!-- Sidebar/menu -->
	<c:import url="../navegacao.jsp"/>

	<div class="w3-container w3-main" id="contact1"	style=" margin-left: 300px;margin-top: 75px;padding: 1em;
    overflow: hidden;">
		<h1>
			<b>Biblioteca De jogos</b>
		</h1>
	
		<a  href="addJogos.jsp">Cadastrar</a>
		
		
			<div class="w3-row-padding" style="padding-bottom: 50px">
   			
   				
			<jsp:useBean id="d" class="br.com.ocio.piquisaweb.dao.GamesDAO" />
		
				<c:forEach var="g" items="${d.list}">
				<div class="w3-half">
					<img src="imgplus/${g.img}" style="width:100% ;border-color: black;" onclick="onClick(this)" 
					alt=" ${g.nome}  
					<br>
      				<p>Descricao: ${g.descricao}  
      				<br>
      				Data De Lancamento: ${g.dtLancamento.time}
      				<br>
      				Classificacao de Idade:${g.classificaoIdade }
					<br>
					Preco:${g.preco }
					<br>
					</p> <a href='alteraJogos.jsp?cod=${g.codigo }&No=${g.nome }&Em=${g.descricao }&Mes=<fmt:formatDate
					value='${g.dtLancamento.time}' pattern='dd/MM/yyyy'/>&ci=${g.classificaoIdade }&pre=${g.preco }&img=${g.img }'>Modificar</a>
					<a href='/priquisa/remover?cod=${g.codigo }'>Remover</a> "/>
					<div style="position: absolute;margin-top: -40px;color:white"> ${g.nome} por: ${g.preco } </div>
						
						<div id="modal01" class="w3-modal w3-black" style="padding-top:0" onclick="this.style.display='none'">
    <span class="w3-button w3-black w3-xxlarge w3-display-topright">×</span>
    
    <div class="w3-modal-content w3-animate-zoom w3-center w3-transparent w3-padding-64">
      <img id="img01" class="w3-image">
      <p id="caption"></p>
    </div>
  </div>
  </div>
						
					
				
				</c:forEach>	
		
			</div>
		</div>
		
		
	
<script>


	function w3_open() {
    document.getElementById("mySidebar").style.display = "block";
    document.getElementById("myOverlay").style.display = "block";
}
 
function w3_close() {
    document.getElementById("mySidebar").style.display = "none";
    document.getElementById("myOverlay").style.display = "none";
}

// Modal Image Gallery
function onClick(element) {
  document.getElementById("img01").src = element.src;
  document.getElementById("modal01").style.display = "block";
  var captionText = document.getElementById("caption");
  captionText.innerHTML = element.alt;
}
	
	
</script>	
	

</body>
</html>