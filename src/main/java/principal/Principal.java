package principal;

import java.util.ArrayList;
import java.util.List;

import dao.ReceitaDAO;
import dao.PessoaDAO;
import entities.Receita;
import entities.Pessoa;

/**
 * @author Pedro Alex
 */
public class Principal {
	
	public static void main(String[] args) {		
		ReceitaDAO receitaDAO = new ReceitaDAO();
		
		Receita receita1 = new Receita();
		receita1.setDescricao("Salário Empresa 1");
		receita1.setValor(1250.0);
		
		receitaDAO.salvar(receita1);

		Receita receita2 = new Receita();
		receita2.setDescricao("Salário Empresa 2");
		receita2.setValor(1050.98);
		
		receitaDAO.salvar(receita2);
		
		List<Receita> receitas = new ArrayList<Receita>();
		receitas.addAll(receitaDAO.listarTodos());

		PessoaDAO pessoaDAO = new PessoaDAO();
		
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Carlos");
		pessoa.setReceitas(receitas);
		
		pessoaDAO.salvar(pessoa);
		
	}
}
