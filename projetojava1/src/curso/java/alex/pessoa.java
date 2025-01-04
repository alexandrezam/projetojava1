package curso.java.alex;

import java.util.Date;

public class pessoa {

	private string Nome;
	private string Sobrenome;
	
	private int Idade;
	
	private Date dataNascimento;
	
	private Date datanascimento2;
	
	
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public int getIdade() {
		return Idade;
	}
	public void setIdade(int idade) {
		Idade = idade;
	}
	public string getNome() {
		return Nome;
	}
	public void setNome(string nome) {
		Nome = nome;
	}
	public string getSobrenome() {
		return Sobrenome;
	}
	public void setSobrenome(string sobrenome) {
		Sobrenome = sobrenome;
	}
	
	
}
