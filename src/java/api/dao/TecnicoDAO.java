package api.dao;


import api.modelo.Tecnico;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author messias
 */
public interface TecnicoDAO {
    
    
    
    public void insert(Tecnico tecnico);
    public Tecnico findById(int id);
    public void update(Tecnico tecnico);
    public void delete(Tecnico tecnico);
    
    

    
}
