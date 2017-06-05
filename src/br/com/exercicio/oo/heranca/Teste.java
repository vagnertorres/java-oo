package br.com.exercicio.oo.heranca;

public class Teste {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno("vagner", "rua", "123", "123", "123");
	
		aluno.setNome("Vagner");
		System.out.println(aluno.getNome());
		
		/* Outra maneira de herança. Porém o mesmo só acessa os atributos da classe pai Pessoa
		Pessoa aluno = new Aluno();
		
		Pessoa professor = new Professor();*/
		
	}
}
