package dao;

import javax.persistence.EntityManager;

import entities.Autor;
import util.HibernateUtil;

public class AutorDAO {

	public void salvar(Autor autor) {
    	EntityManager entityManager = HibernateUtil.getEntityManager();

    	entityManager.getTransaction().begin();
    	entityManager.persist(autor);
    	entityManager.getTransaction().commit();

    	entityManager.close();
	}
	
}
