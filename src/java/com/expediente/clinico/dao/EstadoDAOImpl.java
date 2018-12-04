
package com.expediente.clinico.dao;

import com.expediente.clinico.model.Estado;
import java.util.List;
import javax.persistence.EntityManager;

public class EstadoDAOImpl implements EstadoDAO{
    
    
    @Override
    public void crearRegistro(Estado estado) {
        EntityManager em = JPAUtility.getEntityManager();
        em.getTransaction().begin();
        em.persist(estado);
        em.getTransaction().commit();
        em.close();
        JPAUtility.close();
    }

    @Override
    public void actualizarRegistro(Estado estado) {
        EntityManager em;
        Estado estadoAntes;
        em = JPAUtility.getEntityManager(); 
        estadoAntes = em.find(Estado.class,estado.getId());
        em.getTransaction().begin();
        estadoAntes = estado;
        em.getTransaction().commit();
        em.close();
        JPAUtility.close();
        
    }

    @Override
    public void eliminarRegistro(Estado estado) {
        EntityManager em = JPAUtility.getEntityManager();
        em.remove(estado);
        em.getTransaction().commit();
        em.close();
        JPAUtility.close();
    }

    @Override
    public Estado obtenerRegistro(Long idEstado) {
        EntityManager em = JPAUtility.getEntityManager();
        Estado estado;
        estado = em.find(Estado.class, 1);
        System.out.println(estado.getNombre());
        JPAUtility.close();
        return estado;
    }

    @Override
    public List<Estado> obtenerRegstros(Long idEstado) {
        return null;
    }
    

    
}
