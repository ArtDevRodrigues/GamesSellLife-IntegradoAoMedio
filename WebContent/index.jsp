<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8" %>
<%@page import="br.com.ocio.piquisaweb.dao.GamesDAO" %>
<%@page import="br.com.ocio.piquisaweb.modelo.Games" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<title>Games Sell Life</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="shortcut icon" type="imagem/png" href="yinyang.png"/>
<link rel="stylesheet" href="novocss.css">
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Poppins">
<link rel="stylesheet" href="../novocss.css">
<link rel="stylesheet" href="../css/page4.css">
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Poppins">
<style>
body,h1,h2,h3,h4,h5 {font-family: "Poppins", sans-serif}
body {font-size:16px;}
.w3-half img{margin-bottom:-6px;margin-top:16px;opacity:0.8;cursor:pointer}
.w3-half img:hover{opacity:5}
</style>
<body style="background-image: url('imagens/1.jpg');background-size: cover;
	background-attachment:fixed;background-repeat: no-repeat; ">

<!-- Sidebar/menu -->
<nav class="w3-sidebar w3-red w3-collapse w3-top w3-large w3-padding" style="z-index:3;width:300px;font-weight:bold;" id="mySidebar"><br>
  <a href="javascript:void(0)" onclick="w3_close()" class="w3-button w3-hide-large w3-display-topleft" style="width:100%;font-size:22px">Close Menu</a>
  <div class="w3-container">
    <h3 class="w3-padding-64"><b>Games Sell<br>Life</b></h3>
  </div>
  <div class="w3-bar-block">
    <a href="index.jsp" onclick="w3_close()" class="w3-bar-item w3-button w3-hover-white">Pagina Inicial</a> 
     
    <a href="paginasExtras/LoginParaOCarinho.html" onclick="w3_close()" class="w3-bar-item w3-button w3-hover-white">Carrinho</a> 
    <a href="paginasExtras/LoginParaBiblioteca.html" onclick="w3_close()" class="w3-bar-item w3-button w3-hover-white">Biblioteca</a> 
    <a href="paginasExtras/InfoSite.html" onclick="w3_close()" class="w3-bar-item w3-button w3-hover-white">Informações Sobre o Site</a> 
    <a href="paginasExtras/Suporte.html" onclick="w3_close()" class="w3-bar-item w3-button w3-hover-white">Suporte ao Cliente</a>
  </div>
</nav>

<!-- Top menu on small screens -->
<header class="w3-container w3-top w3-hide-large w3-red w3-xlarge w3-padding">
  <a href="javascript:void(0)" class="w3-button w3-red w3-margin-right" onclick="w3_open()">=</a>
  <span>Games Sell Life</span>
</header>

<!-- Overlay effect when opening sidebar on small screens -->
<div class="w3-overlay w3-hide-large" onclick="w3_close()" style="cursor:pointer" title="close side menu" id="myOverlay"></div>

<!-- !PAGE CONTENT! -->
<div class="w3-main" style="margin-left:340px;margin-right:40px">

  <!-- Header -->
  <div class="w3-container" style="margin-top:80px" id="showcase">
    <h1 class="w3-jumbo"><b>Venda de Games</b></h1>
    <h1 class="w3-xxxlarge w3-text-red"><b>Mostruário: </b></h1>
   
  </div>
  
  <!-- Photo grid (modal) -->
  <div class="w3-row-padding" style="padding-bottom: 50px">
    
    <div class="w3-row-padding" style="padding-bottom: 50px">
   			
   				
			<jsp:useBean id="d" class="br.com.ocio.piquisaweb.dao.GamesDAO" />
		
				<c:forEach var="g" items="${d.list}" end="5">
				<c:if test="${not empty g.codigo }">
				
				<div class="w3-half">
					<img src="jspPags/imgplus/${g.img}" style="width:550px ;height: 350px;border-color: black;"onclick="onClick(this)"  alt="${g.nome}  <br>
      					 <p>Descricao: ${g.descricao}  <br>Data De Lancamento: ${g.dtLancamento.time}
      					 <br>Classificacao de Idade:${g.classificaoIdade }
							<br>Preco:${g.preco }
							
							<br> </p> <a href='paginasExtras/LoginParaBiblioteca.html'>Adquirir</a>"/>
						<div style="position: absolute;margin-top: -40px;color:white"> ${g.nome} por: ${g.preco } </div>
						
						<div id="modal01" class="w3-modal w3-black" style="padding-top:0" onclick="this.style.display='none'">
    <span class="w3-button w3-black w3-xxlarge w3-display-topright">×</span>
    
    <div class="w3-modal-content w3-animate-zoom w3-center w3-transparent w3-padding-64">
      <img id="img01" class="w3-image">
      <p id="caption"></p>
    </div>
  </div>
  </div>
						
					
				</c:if>
				<c:if test="${ empty g.nome}">
				<div class="w3-container" id="services" style="margin-top:75px">
    				<h1 class="w3-xxxlarge w3-text-red"><b>Aviso</b></h1>
    				<hr style="width:50px;border:5px solid red" class="w3-round">
    				<p>No momento não ha lista de jogos Espere algum ADM adicionar</p>
    				
   				</div>
				</c:if>
				</c:forEach>
			</div>
			</div>
			</div>

   

  <!-- Modal for full size images on click-->
  <div id="modal01" class="w3-modal w3-black" style="padding-top:0" onclick="this.style.display='none'">
    <span class="w3-button w3-black w3-xxlarge w3-display-topright">×</span>
    <div class="w3-modal-content w3-animate-zoom w3-center w3-transparent w3-padding-64">
      <img id="img01" class="w3-image">
      <p id="caption"></p>
    </div>
  </div>


<script>
// Script to open and close sidebar
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
