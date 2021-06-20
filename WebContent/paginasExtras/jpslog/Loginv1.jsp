<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<title>Games Sell Life</title>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<!-- <meta charset="UTF-8">-->
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="shortcut icon" type="imagem/png" href="../../yinyang.png"/>
<link rel="stylesheet" href="../../novocss.css">
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Poppins">
<style>
body,h1,h2,h3,h4,h5 {font-family: "Poppins", sans-serif}
body {font-size:16px;}
.w3-half img{margin-bottom:-6px;margin-top:16px;opacity:0.8;cursor:pointer}
.w3-half img:hover{opacity:5}
</style>
<body style="background-image: url('../imagens/fotob2.jpg');background-size: cover;
	background-attachment:fixed;background-repeat: no-repeat; ">

<!-- Sidebar/menu -->
<nav class="w3-sidebar w3-red w3-collapse w3-top w3-large w3-padding"
		style="z-index: 3; width: 300px; font-weight: bold;" id="mySidebar">
		<br> <a href="javascript:void(0)" onclick="w3_close()" class="w3-button w3-hide-large w3-display-topleft"style="width: 100%; font-size: 22px">Close Menu</a>
		<div class="w3-container">
			<h3 class="w3-padding-64"><b>Games Sell<br>Life	</b></h3>
		</div>
		<div class="w3-bar-block">
			<a href="../index.html"onclick="w3_close()" class="w3-bar-item w3-button w3-hover-white">Pagina Inicial</a>
			<!-- <a href="http://localhost:8080/priquisa/paginasExtras/Login.html" onclick="w3_close()" class="w3-bar-item w3-button w3-hover-white">Login</a> -->
			<a href="LoginParaOCarinho.html" onclick="w3_close()" class="w3-bar-item w3-button w3-hover-white">Carrinho</a>
			<a href="LoginParaBiblioteca.html" onclick="w3_close()" class="w3-bar-item w3-button w3-hover-white">Biblioteca</a> 
			<a href="InfoSite.html" onclick="w3_close()" class="w3-bar-item w3-button w3-hover-white">Informações Sobre o Site</a> 
			<a href="Suporte.html" onclick="w3_close()"class="w3-bar-item w3-button w3-hover-white">Suporte ao Cliente</a>
		</div>
	</nav>

<!-- Top menu on small screens -->
<header class="w3-container w3-top w3-hide-large w3-red w3-xlarge w3-padding">
  <a href="javascript:void(0)" class="w3-button w3-red w3-margin-right" onclick="w3_open()">☰</a>
  <span>Games Sell Life</span>
</header>

<div class="w3-main" style="margin-left:340px;margin-right:40px">
  <!-- Modal for full size images on click-->
  <div id="modal01" class="w3-modal w3-black" style="padding-top:0" onclick="this.style.display='none'">
    <span class="w3-button w3-black w3-xxlarge w3-display-topright">×</span>
    <div class="w3-modal-content w3-animate-zoom w3-center w3-transparent w3-padding-64">
      <img id="img01" class="w3-image">
      <p id="caption"></p>
    </div>
  </div>
 
  <!-- Contact -->
  <div class="w3-container" id="contact1" style="margin-top:75px">
    <h1 class="w3-xxxlarge w3-text-red"><b>Login para a biblioteca</b></h1>
    <hr style="width:50px;border:5px solid red" class="w3-round">
    <p>preencha os dados para ir na biblioteca</p>
    <form action="login" method="post" name="myfrom">
      
      <div class="w3-section">
        <label>Email</label>
        <input id="s" class="w3-input w3-border" type="text" name="email" required>
      </div>
      <div class="w3-section">
        <label>Senha</label>
        <input id="e" class="w3-input w3-border" type="password" name="pass" required>
      </div>
      <button type="submit" value="Submit" class="w3-button w3-block w3-padding-large w3-red w3-margin-bottom">Entar</button>
    </form>  
  </div>

<!-- End page content -->
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
