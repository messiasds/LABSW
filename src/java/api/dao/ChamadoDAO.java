package api.dao;


import api.modelo.Chamado;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author messias
 */
public interface ChamadoDAO {
    
    public void insert(Chamado chamado);
    public Chamado findById(int id);
    public void update(Chamado chamado);
    public void delete(int id);
    public List<Chamado> findByClienteId(int id);
    
    
}
