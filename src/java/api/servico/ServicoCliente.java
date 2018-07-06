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
public interface ServicoCliente {
    
    public Cliente pesquisarId(int id);
    public void incluirCliente(Cliente c);
    public void deletarCliente(Cliente c);
    public void atualizarCliente(Cliente c);
    public List<Chamado> buscarChamados(int id); // id do cliente
    public List<Mensagens> buscarMensagens(int id); // id do cliente
            
    
    
}
