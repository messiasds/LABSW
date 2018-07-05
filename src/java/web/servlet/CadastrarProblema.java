/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author messias
 */
@WebServlet(name = "novoProblema", urlPatterns = {"/novoProblema"})
public class CadastrarProblema extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        ServletContext contexto = getServletContext();
        contexto.getRequestDispatcher("/jsp/cadastrarProblema.jsp").forward(req, resp);
        

    }
    
    
    
    

    
    
    
}
