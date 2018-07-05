/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
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
@WebServlet(name = "logar", urlPatterns = {"/logar"})
public class Logar extends HttpServlet {

  
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String usuario;
        String senha;
        String tipo;
        
        ServletContext contexto = getServletContext();
        usuario = request.getParameter("usuario");
        senha = request.getParameter("senha");
        tipo = request.getParameter("tipo");
         System.out.println(usuario);
          System.out.println(senha);
           System.out.println(tipo);
 
        
        
        switch(tipo.toLowerCase()){
                case "cliente":
                    System.out.println("CERTO");
                if(usuario.equals("cliente") & senha.equals("123")){
                contexto.getRequestDispatcher("/jsp/principal.jsp").forward(request, response);
                
            } else {
                    PrintWriter pw = response.getWriter();
                    pw.write("SENHA INCORRETA");
                    pw.close();
                }
              break;
              
              
                
            }
         
        
    }
        

    

}
