$(function(){
	function Adicionar(){
		$("#tblCadastro tbody").append(
			"<tr>"+
			"<td><input type='text'/></td>"+
			"<td><input type='text'/></td>"+
			"<td><input type='text'/></td>"+
			"<td><input type='text'/></td>"+
			"<td><input type='text'/></td>"+
			"<td><input type='text'/></td>"+
			"<td><img src='images/delete.png' class='btnExcluir'/></td>"+
			"<td><img src='images/disk.png' class='btnSalvar'></td>"+
		"</tr>");

		$(".btnSalvar").bind("click", Salvar);     
		$(".btnExcluir").bind("click", Excluir);
	};

	function Salvar(){
		var par = $(this).parent().parent(); //tr
		var tdCod = par.children("td:nth-child(1)");
		var tdnome = par.children("td:nth-child(2)");
		var tdDesc = par.children("td:nth-child(3)");
		var  tdDtLan= par.children("td:nth-child(4)");
		var tdClasI = par.children("td:nth-child(5)");
		var tdpre = par.children("td:nth-child(6)");
		var tdBotoes = par.children("td:nth-child(7)");

		tdCod.html(tdCod.children("input[type=text]").val());
		tdnome.html(tdnome.children("input[type=text]").val());
		tdDesc.html(tdDesc.children("input[type=text]").val());
		tdDtLan.html(tdDtLan.children("input[type=text]").val());
		tdpre.html(tdpre.children("input[type=text]").val());
		tdClasI.html(tdClasI.children("input[type=text]").val());
		tdBotoes.html("<img src='images/delete.png'class='btnExcluir'/><img src='images/pencil.png' class='btnEditar'/>");

		$(".btnEditar").bind("click", Editar);
		$(".btnExcluir").bind("click", Excluir);
	};

	function Editar(){
		var par = $(this).parent().parent(); 
		var tdCod = par.children("td:nth-child(1)");
		var tdnome = par.children("td:nth-child(2)");
		var tdDesc = par.children("td:nth-child(3)");
		var  tdDtLan= par.children("td:nth-child(4)");
		var tdClasI = par.children("td:nth-child(5)");
		var tdBotoes = par.children("td:nth-child(6)");
		
		tdCod.html("<input type='text' id='txtCod' value='"+tdCod.html()+"'/>");
		tdnome.html("<input type='text' id='txtNome' value='"+tdnome.html()+"'/>");
		tdDesc.html("<input type='text' id='txtDesc' value='"+tdDesc.html()+"'/>");		
		tdDtLan.html("<input type='text'id='txtLan' value='"+tdDtLan.html()+"'/>");
		tdClasI.html("<input type='text' id='txtClasI' value='"+tdClasI.html()+"'/>");
		tdpre.html("<input type='text' id='txtpre' value='"+tdpre.html()+"'/>");
		tdBotoes.html("<img src='images/disk.png' class='btnSalvar'/>");

		$(".btnSalvar").bind("click", Salvar);
		$(".btnEditar").bind("click", Editar);
		$(".btnExcluir").bind("click", Excluir);
	};

	function Excluir(){
	    var par = $(this).parent().parent(); //tr
	    par.remove();
	};

	$(".btnEditar").bind("click", Editar);
	$(".btnExcluir").bind("click", Excluir);
	$("#btnAdicionar").bind("click", Adicionar); 
});
