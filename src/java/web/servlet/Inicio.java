/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web.servlet;

import java.io.IOException;
import javax.servlet.GenericServlet;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

/**
 *
 * @author messias
 * 
 */
@WebServlet(name="Inicio",  urlPatterns = {"/inicio","/"})
public class Inicio extends HttpServlet{

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        
    ServletContext contexto = getServletContext();
    contexto.getRequestDispatcher("/jsp/login.jsp").forward(req, res);
    
           
    }
    
    
}
