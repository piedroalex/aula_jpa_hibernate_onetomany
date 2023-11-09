package dao;

import javax.persistence.EntityManager;

import entities.Post;
import util.HibernateUtil;

public class PostDAO {

	public void salvar(Post post) {
    	EntityManager entityManager = HibernateUtil.getEntityManager();
    	entityManager.getTransaction().begin();
    	entityManager.persist(post);
    	entityManager.getTransaction().commit();
    	entityManager.close();
	}
	
	public Post buscarPorId(long id) {
    	EntityManager entityManager = HibernateUtil.getEntityManager();
    	Post post = entityManager.find(Post.class, id);
    	entityManager.close();
    	return post;
	}
	
}
