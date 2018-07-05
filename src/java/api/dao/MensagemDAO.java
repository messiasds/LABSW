package api.dao;


import api.modelo.Mensagem;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author messias
 */
    
    public interface MensagemDAO {
    
    public void insert(Mensagem mensagem);
    public Mensagem findById(int id);
    public void update(Mensagem mensagem);
    public void delete(Mensagem mensagem);
    
    

    
}
