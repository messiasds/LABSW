/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core.dao;

import api.dao.ChamadoDAO;
import api.modelo.Chamado;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

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
    public void delete(int id) {
        
        
        Chamado r = em.find(Chamado.class, id);
        
        em.getTransaction().begin();
        em.remove(r);
        em.getTransaction().commit();
    }

    @Override
    public List<Chamado> findByClienteId(int id) {
        
        List<Chamado> lista;
        
        String queryStr = "SELECT c FROM Chamado c JOIN c.cliente j WHERE j.id=:idCliente";
    
        Query query = em.createQuery(queryStr);
        query.setParameter("idCliente", id);
   
        lista = query.getResultList();
        return lista;
        
        
    }
    
    
    
}
