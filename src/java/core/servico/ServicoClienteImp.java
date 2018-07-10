/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core.servico;

import api.dao.ChamadoDAO;
import api.dao.ClienteDAO;
import api.modelo.Chamado;
import api.modelo.Cliente;
import api.servico.ServicoCliente;
import core.dao.ChamadoDAOJPA;
import core.dao.ClienteDAOMySQL;
import java.util.List;
import web.servlet.Mensagens;

/**
 *
 * @author messias
 */
public class ServicoClienteImp implements ServicoCliente {
    
    ClienteDAO  clienteDao = new ClienteDAOMySQL();

    @Override
    public Cliente pesquisarId(int id) {
       
        return clienteDao.findById(id);
       
    }
        

    @Override
    public void incluirCliente(Cliente c) {
        
        clienteDao.insert(c);
        
    }

    @Override
    public void deletarCliente(Cliente c) {
        
        clienteDao.delete(c);
        
    }

    @Override
    public void atualizarCliente(Cliente c) {
        
        clienteDao.update(c);
        
    }

    @Override
    public List<Chamado> buscarChamados(int id) {
        
        ChamadoDAO dao = new ChamadoDAOJPA();
        dao.findById(id);
        return null;
    }

    @Override
    public List<Mensagens> buscarMensagens(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
