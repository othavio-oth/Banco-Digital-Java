package principal;

public class Cliente {
	protected String nome;
	protected String cpf;
	
	
	public Cliente(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}


	public String getNome() {
		return nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
