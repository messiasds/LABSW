/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package api.servico;

import api.modelo.Mensagem;
import java.util.List;

/**
 *
 * @author messias
 */
public interface ServicoMensagem {
    
    public Mensagem pesquisarId(int id);
    public void incluirMensagem(Mensagem m);
    public void deletarMensagem(Mensagem m);
    //public void atualizarMe(Cliente c);
    public List<Mensagem> buscarTodasMensagens(); 
    
            
    
}
