package br.com.exercicio.oo.palavra.chave;

public class Aluno{
	
	private String curso;
	private String[] notas;
	
	public Aluno() {
		//super();
	}

	public Aluno(String nome, String endereco, String telefone, String cpf, String telefoneCelular) {
		
		//super(nome, endereco, telefone, cpf, telefoneCelular);
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
		
		String s = "Endereço do Aluno: ";
		//s += super.getEndereco();
		
		return s;
	}

	//@Override
	public void imprimirEtiquetaEndereco() {
		
		System.out.println(this.obterEtiquetaEndereco());
		
	}	
}
