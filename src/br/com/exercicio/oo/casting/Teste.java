package br.com.exercicio.oo.casting;

public class Teste {

	public static void main(String[] args) {
		
		/*Exemplo Casting*/
		
		/*Aluno aluno = new Aluno();
		Professor professor = new Professor();
		
		Pessoa pessoaAluno = aluno; //upcasting
		Pessoa pessoaProfessor = professor; //upcasting
		
		//ou podemos fazer de outra maneira
		
		Pessoa aluno2 = (Pessoa) new Aluno();
		Pessoa professor2 = (Pessoa) new Professor();
		
		Pessoa aluno3 = new Pessoa();
		Aluno aluno4 = (Aluno) aluno3;*/
		
		
		
		/*Exemplo instanceof*/
		Pessoa pessoa = new Pessoa();
		Aluno aluno = new Aluno();
		Professor prof = new Professor();
		
		if (pessoa instanceof Pessoa) {
			System.out.println("é do tipo Pessoa");
		}
		
		if (aluno instanceof Aluno) {
			System.out.println("é do tipo Aluno");
		}
		
		if (prof instanceof Professor) {
			System.out.println("é do tipo Professor");
		}			
	}
}
