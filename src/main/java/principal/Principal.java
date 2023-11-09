package principal;

import java.util.ArrayList;
import java.util.List;

import dao.AutorDAO;
import dao.PostDAO;
import entities.Autor;
import entities.Post;

public class Principal {
	
	public static void main(String[] args) {
		PostDAO postDAO = new PostDAO();
		
		Post post1 = new Post();
		post1.setTitulo("Artigo 1");
		
		Post post2 = new Post();
		post2.setTitulo("Artigo 2");
		
		postDAO.salvar(post1);
		postDAO.salvar(post2);
		
		List<Post> posts = new ArrayList<Post>();
		post1 = postDAO.buscarPorId(1);
		post2 = postDAO.buscarPorId(2);
		posts.add(post1);
		posts.add(post2);

		AutorDAO autorDAO = new AutorDAO();
		
		Autor autor = new Autor();
		autor.setNome("Pedro Alex");
		autor.setPosts(posts);
		
		autorDAO.salvar(autor);
		
	}
}
