package br.com.exercicio.heranca;

public class Teste {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		
		Professor professor = new Professor();
		
		Pessoa pessoa = new Pessoa();
		
		aluno.setNome("Vagner");
		System.out.println(aluno.getNome());
		
		/* Outra maneira de heran�a. Por�m o mesmo s� acessa os atributos da classe pai Pessoa
		Pessoa aluno = new Aluno();
		
		Pessoa professor = new Professor();*/
		
	}
}
