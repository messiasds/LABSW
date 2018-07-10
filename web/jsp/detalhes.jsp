<%-- 
    Document   : detalhes
    Created on : 10/07/2018, 01:44:09
    Author     : messias
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Detalhes do chamado</title>
    </head>
    <body>
        <h1>Detalhes do chamado</h1>
        
        Titulo: <input type="text" size="30" id="tilulo" readonly="true" value="${chamado.titulo}"><br>
        Descrição<br>
        <textarea rows="8 " cols="70" readonly="true">
        ${chamado.descricao}"
        </textarea><br>
        <form name="botoes" action="chamado">
         <input type="hidden" name="idDetalhe" readonly="true" value="${chamado.id}">   
         <input type="submit" value="Editar" name="atualizar"> <br>
        <input type="submit"  value="Excluir" name="excluir">
        </form>
        
        
            
        
    </body>
</html>
