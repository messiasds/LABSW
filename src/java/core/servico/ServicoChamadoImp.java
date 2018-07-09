/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core.servico;

import api.modelo.Chamado;
import api.servico.ServicoChamado;
import core.dao.ChamadoDAOJPA;
import java.util.List;

/**
 *
 * @author messias
 */
public class ServicoChamadoImp implements ServicoChamado {
    
    ChamadoDAOJPA chamadoDao = new ChamadoDAOJPA();

    @Override
    public Chamado pesquisarId(int id) {
        
        return chamadoDao.findById(id);
        
        
    }

    @Override
    public void incluirChamado(Chamado c) {
        ChamadoDAOJPA chamadoDao = new ChamadoDAOJPA();
        
        chamadoDao.insert(c);
        
        
           }

    @Override
    public void deletarChamado(Chamado c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void atualizarChamado(Chamado c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Chamado> buscarTodosChamados() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
