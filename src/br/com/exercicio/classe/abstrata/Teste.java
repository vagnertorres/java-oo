package br.com.exercicio.classe.abstrata;

public class Teste {

	public static void main(String[] args) {
		
		//Pessoa pessoa = new Pessoa();
		Pessoa aluno = new Aluno();
		Pessoa professor = new Professor();
		
		//pessoa.setEndereco("rua 1, num1");
		aluno.setEndereco("rua 2, num 2");
		professor.setEndereco("rua 3, num 3");
		
		//System.out.println(aluno.obterEtiquetaEndereco());
		//System.out.println(professor.obterEtiquetaEndereco());
		
		aluno.imprimirEtiquetaEndereco();
		professor.imprimirEtiquetaEndereco();
	}
}
