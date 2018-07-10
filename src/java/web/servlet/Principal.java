/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web.servlet;

import api.modelo.Chamado;
import api.servico.ServicoChamado;
import core.servico.ServicoChamadoImp;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

/**
 *
 * @author messias
 */
@WebServlet(name = "Principal", urlPatterns = {"/principal"})
public class Principal extends HttpServlet {
    
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        
        List<Chamado> lista;
                
        int id=4 ; //usuario messias
        
        ServicoChamado chamadoServ = new ServicoChamadoImp();
        
        // Busca no BD as chamadas aberta pelo usuario Logado
        lista = chamadoServ.buscarTodosChamadosCliente(id);
        
        // teste daquele jeito...
        for(Chamado c:lista)
            System.out.println(c.getDescricao()+ "nome " + c.getCliente().getNome());
      
        //redireciona 
        ServletContext contexto = getServletContext();
        req.setAttribute("chamados",lista);
        contexto.getRequestDispatcher("/jsp/principal.jsp").forward(req, res);
    
        
            
           
    }
    

  

}
