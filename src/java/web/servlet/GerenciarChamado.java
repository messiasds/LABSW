/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web.servlet;

import api.modelo.Chamado;
import api.modelo.Cliente;
import api.servico.ServicoChamado;
import core.dao.ClienteDAOMySQL;
import core.servico.ServicoChamadoImp;
import java.io.IOException;
import java.util.List;
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
@WebServlet(name = "GerenciarChamado", urlPatterns = {"/chamado"})
public class GerenciarChamado extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       
       ServletContext contexto = getServletContext();
       ServicoChamado chamadoServ = new ServicoChamadoImp();
       int id;
       
       if(req.getParameter("detalheBtn") != null){
           
       id=Integer.parseInt(req.getParameter("id"));
       Chamado resposta= chamadoServ.pesquisarId(id);
       req.setAttribute("chamado", resposta);
       
       contexto.getRequestDispatcher("/jsp/detalhes.jsp").forward(req, resp);
       
       }
       
       else
           
           if(req.getParameter("excluir") != null){
               id=Integer.parseInt(req.getParameter("idDetalhe"));
               chamadoServ.deletarChamado(id);
               
               List<Chamado> c = chamadoServ.buscarTodosChamadosCliente(4);
               req.setAttribute("chamados", c);
               contexto.getRequestDispatcher("/jsp/principal.jsp").forward(req, resp);
               
       }
       else
       if(req.getParameter("btnNovo") != null) {
           
            contexto.getRequestDispatcher("/jsp/CadastrarProblema.jsp").forward(req, resp);
       }
       
       
        
      
      
    }
    
    // cadastra um novo chamado

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        String titulo;
        String descricao;
        
        ServletContext contexto = getServletContext();
        
        ServicoChamado chamadoServ = new ServicoChamadoImp();
        ClienteDAOMySQL daoCliente = new ClienteDAOMySQL();
        
        Cliente cliente= daoCliente.findById(4);
        
        titulo = req.getParameter("titulo");
        descricao = req.getParameter("descricao");
        
        
        
        
        Chamado c = new Chamado();
        c.setCliente(cliente);
        c.setEstado(true);
        c.setTitulo(titulo);
        c.setDescricao(descricao);
        
        if(req.getParameter("btnNovo") != null) {
         
        chamadoServ.incluirChamado(c);
        
        List<Chamado> clt = chamadoServ.buscarTodosChamadosCliente(4);
        req.setAttribute("chamados", clt);
        contexto.getRequestDispatcher("/jsp/principal.jsp").forward(req, resp);
            
           
            
       }
        
    }
    
    
    
    


    
}
