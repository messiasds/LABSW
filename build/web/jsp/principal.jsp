<%-- 
    Document   : index.html
    Created on : 04/07/2018, 16:31:52
    Author     : messias
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="api.modelo.Chamado" %>
<%@page import="java.util.List" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<!-- Pagina inicial do usuario depois de logado -->
<html>

<head>
   <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
   <link rel="stylesheet"  type=text/css href="${pageContext.request.contextPath}/css/menus.css "> 
    <link rel="stylesheet"  type=text/css href="${pageContext.request.contextPath}/css/lista.css" >  

<title>Pagina inicial do cliente</title>
</head>
<body>
<div class="menuCliente">
    <a href="#">Cadastro</a>
    <a href="principal">inicio</a>
    <a href="mensagens">Mensagens</a>
    <a href="inicio">Sair</a>
    
</div>
    <!-- div invisivel 
    <div id="detalhes" class="detalhe">
        <div class="conteudo">
        <p id="tituloDetalhes">Detalhes do chamado</p>
        <p id="idCategoria"></p>
        <p id="idSubCategoria"></p>
        <p id="idConteudo" class="descricao"></p>
        <input type="button" id="btnOk" value="fechar">    
        </div>-->
    </div> 
    <p class="titulo"> Meus chamados </p>
    <div class="main" >
        
        <div id="formPesquisaDiv">
            
            <form id="pesquisa" action="chamado">
                <input type="radio" name="situcao" id="abertoRadrio" value="aberto"> Mostrar abertos
                <input type="radio" name="situcao"  id="fechadoRadio" value="fechado">Mostrar fechados
                <input type="submit" id="novoChamado" value="Novo" name="btnNovo">
            </form>
        </div>
        
        <!--lista de chamados do cliente  -->

        <div>
            <ol id="listaChamados">
                
                
                <c:forEach items="${chamados}" var="chm" varStatus="indice">
                <li>${chm.titulo} id: ${chm.id}
                    <form id="botoes" action="chamado">
                    <input type="submit" id="btnDetalhes" class="MUDAR" name="detalheBtn" value="ver detalhes" >
                    <input type="hidden" value="${chm.id}" name="id">
                    </form>
                </li>
            </c:forEach>
                </ol>
   
	</div>

    </div>
</body>
<script src="${pageContext.request.contextPath}/js/cliente.js" type="text/javascript" ></script>

</html>
