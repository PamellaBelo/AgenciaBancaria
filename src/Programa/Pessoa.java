package Programa;

public class Pessoa {

	private static int counter = 1;
	
	private String nome; 
	private String cpf;
	private String email;
	
	public Pessoa(String nome, String email, String cpf) {
		
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		setCounter(getCounter() + 1);
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCPF() {
		return cpf;
	}
	public void setCPF(String cpf) {
		this.cpf = cpf;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String toString() {
		return "\nNome: " + this.getNome() +
				"\nCpf: " + this.getCPF() +
				"\nEmail: " + this.getEmail(); 
	}
	public static int getCounter() {
		return counter;
	}
	public static void setCounter(int counter) {
		Pessoa.counter = counter;
	}
}
