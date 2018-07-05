<%-- 
    Document   : index.html
    Created on : 04/07/2018, 16:31:52
    Author     : messias
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!-- Pagina inicial do usuario depois de logado -->
<html>
<head>
   
    <link rel="stylesheet" href="/css/menus.css" type=text/css>
    <link rel="stylesheet" href="/css/lista.css" type=text/css>
<meta charset="UTF-8">
<title>Pagina inicial do cliente</title>
</head>
<body>
<div class="menuCliente">
    <a href="#">Cadastro</a>
    <a href="principal">inicio</a>
    <a href="mensagens">Mensagens</a>
    <a href="inicio">Sair</a>
    
</div>
    <!-- div invisivel -->
    <div id="detalhes" class="detalhe">
        <div class="conteudo">
        <p id="tituloDetalhes">Detalhes do chamado</p>
        <p id="idCategoria"></p>
        <p id="idSubCategoria"></p>
        <p id="idConteudo" class="descricao"></p>
        <input type="button" id="btnOk" value="fechar">    
        </div>
    </div> 
    <p class="titulo"> Meus chamados </p>
    <div class="main" >
        
        <div id="formPesquisaDiv">
            
            <form id="pesquisa">
                <input type="radio" name="situcao" id="abertoRadrio" value="aberto"> Mostrar abertos
                <input type="radio" name="situcao"  id="fechadoRadio" value="fechado">Mostrar fechados
                <input type="button" id="novoChamado" value="Novo">
        </div>
        
        <!--lista de chamados do cliente  -->
        <div>
		<ol id="listaChamados">
		</ol>
	</div>

    </div>
</body>
<script src="/js/cliente.js" type="text/javascript" ></script>

</html>
