/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core.dao;

import api.dao.ChamadoDAO;
import api.modelo.Chamado;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author messias
 */
public class ChamadoDAOJPA implements  ChamadoDAO {
    
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("labEng");
    EntityManager em = emf.createEntityManager();
    
      
    @Override
    public void insert(Chamado chamado) {
       
     em.getTransaction().begin();
     em.persist(chamado);
     em.getTransaction().commit();
    
    }

    @Override
    public Chamado findById(int id) {
        
        return em.find(Chamado.class, id);
        
      
    }
    @Override
    public void update(Chamado chamado) {
     
// gambiarra mudar
     int id =    chamado.getId();
     String titulo=chamado.getTitulo();
     String descricao=chamado.getDescricao();
     boolean estado = chamado.isEstado();
     
     
    Chamado novo = em.find(Chamado.class, id);
    em.getTransaction().begin();
    novo.setTitulo(titulo);
    novo.setDescricao(descricao);
    novo.setEstado(estado);
    em.getTransaction().commit();
    
    }

    @Override
    public void delete(Chamado chamado) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
