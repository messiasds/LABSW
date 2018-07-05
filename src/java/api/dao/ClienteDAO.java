package api.dao;


import api.modelo.Cliente;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author messias
 */
public interface ClienteDAO {
    
   
    public void insert(Cliente usuario);
    public Cliente findById(int id);
    public void update(Cliente cliente);
    public void delete(Cliente cliente);
    
    
}
    

