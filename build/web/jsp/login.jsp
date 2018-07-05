<%-- 
    Document   : login
    Created on : 04/07/2018, 17:07:24
    Author     : messias
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" >
<title>Projeto WEB</title>
<link rel="stylesheet" type="text/css" href="/css/login.css" >
<script src="js/login.js" type="text/javascript" ></script>
</head>
<body>

	
		<div id="login" class="login">
			<form name="Login" method="post" action="logar">
                            <fieldset>
                            <label>Usuario:</label> <input type="text" id="idUsuario" name="usuario"><br> 
                            <label>Senha:</label> <input type="password" id="idSenha" name="senha"><br> 
                            <select id="idTipoLogin" name="tipo">
					<option>Cliente</option>
                                        <option>Técnico</option>
					<option>Administrador</option>
				</select> 
                                <a href="#"> Cadastrar novo usuário</a><br>
                                <input type="submit" value="Logar" id="btnLogar">
                            </fieldset>

			</form>
		</div>
		
	
</body>
</html>
