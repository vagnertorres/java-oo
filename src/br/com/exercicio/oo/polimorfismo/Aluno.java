package br.com.exercicio.oo.polimorfismo;

public class Aluno extends Pessoa {
	
	private String curso;
	private String[] notas;
	
	public Aluno() { }

	public Aluno(String nome, String endereco, String telefone, String cpf, String telefoneCelular) {
		
		super(nome, endereco, telefone, cpf, telefoneCelular);
	}

	public String getCurso() {
		
		return curso;
	}
	
	public void setCurso(String curso) {
		
		this.curso = curso;
	}
	
	public String[] getNotas() {
		
		return notas;
	}
	
	public void setNotas(String[] notas) {
		
		this.notas = notas;
	}
	
	public double calcularMedia() {
		
		return 0.0;
	}
	
	public boolean verificarAprovado() {
		
		return false;
	}
	
	public String obterEtiquetaEndereco() {
		
		String s = "Endere�o do Aluno: ";
		s += super.getEndereco();
		
		return s;
	}
	
	
	
}
