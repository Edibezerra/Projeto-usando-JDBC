package dao;

import java.util.List;

import model.Endereco;

public interface EnderecoDAO {
	
	public int getSequence();

	public void salvar(Endereco endereco);

	public void alterar(Endereco endereco);

	public void remover(int id);

	public Endereco pesquisar(Integer id);

	public List<Endereco> listarTodos();
}
