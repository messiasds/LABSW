/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core.servico;

import api.dao.ChamadoDAO;
import api.modelo.Chamado;
import api.servico.ServicoChamado;
import core.dao.ChamadoDAOJPA;
import java.util.List;

/**
 *
 * @author messias
 */
public class ServicoChamadoImp implements ServicoChamado {
    
   

    @Override
    public Chamado pesquisarId(int id) {
        ChamadoDAOJPA chamadoDao = new ChamadoDAOJPA();
        
        return chamadoDao.findById(id);
        
        
    }

    @Override
    public void incluirChamado(Chamado c) {
        ChamadoDAOJPA chamadoDao = new ChamadoDAOJPA();
        
        chamadoDao.insert(c);
        
        
           }

    @Override
    public void deletarChamado(int id) {
       ChamadoDAOJPA chamadoDao = new ChamadoDAOJPA();
       chamadoDao.delete(id);
        
    
    }

    @Override
    public void atualizarChamado(Chamado c) {
        ChamadoDAOJPA chamadoDao = new ChamadoDAOJPA();
        chamadoDao.update(c);
        
           }

    @Override
    public List<Chamado> buscarTodosChamadosCliente(int id) {
        ChamadoDAO dao = new ChamadoDAOJPA();
        return dao.findByClienteId(id);
                   
    }
    
}
