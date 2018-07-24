package persistencia;

public class Contato {

	private String nome;
	private String sobrenome;
	private String telefone;

	public Contato(String nome, 
			String sobrenome, String telefone) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	@Override
	public String toString() {
		return "Contato [nome=" + nome + ", sobrenome=" + sobrenome + ", telefone=" + telefone + "]";
	}

	public void salvar() {
		// TODO fazer o insert
	}
	

}
