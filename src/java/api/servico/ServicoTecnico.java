/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package api.servico;

import api.modelo.Chamado;
import api.modelo.Tecnico;
import java.util.List;
import web.servlet.Mensagens;

/**
 *
 * @author messias
 */
public interface ServicoTecnico {
    
    public Tecnico pesquisarId(int id);
    public void incluirTecnico(Tecnico t);
    public void deletarTecnico(Tecnico t);
    public void atualizaTecnico(Tecnico t);
    public List<Chamado> buscarChamados(int id); // id do tecnico
    public List<Mensagens> buscarMensagens(int id); // id do tecnico
            
    
}
