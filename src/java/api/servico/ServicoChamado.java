/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package api.servico;

import api.modelo.Chamado;
import api.modelo.Cliente;
import java.util.List;
import web.servlet.Mensagens;

/**
 *
 * @author messias
 */
public interface ServicoChamado {
    
    public Chamado pesquisarId(int id);
    public void incluirChamado(Chamado c);
    public void deletarChamado(int id);
    public void atualizarChamado(Chamado c);
    public List<Chamado> buscarTodosChamadosCliente(int id); // id do cliente
    
    
            
    
}
