/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package api.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author messias
 * 
 * 
 */

@Entity
public class Chamado {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column
    private String titulo;
    
    @Column
    private String descricao;
    @Column
    private boolean estado;
    
    @ManyToOne(fetch =FetchType.EAGER)
    private Cliente cliente;
    
    //private Tecnico tecnico;
    //private Mensagem mensagem = null;

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    //public Tecnico getTecnico() {
      //  return tecnico;
    //}

   // public void setTecnico(Tecnico tecnico) {
     //   this.tecnico = tecnico;
    //}

    //public Mensagem getMensagem() {
      //  return mensagem;
    //}

    //public void setMensagem(Mensagem mensagem) {
      //  this.mensagem = mensagem;
    //}
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    
}
