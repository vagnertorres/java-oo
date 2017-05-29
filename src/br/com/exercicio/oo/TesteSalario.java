package br.com.exercicio.oo;

public class TesteSalario {

	public static void main(String[] args) {
		
		Salario salario = new Salario();
		
		salario.setQuantidadeHorasTrabalhadas(140.2);
		salario.setValorHora(95.2);
		
		
		System.out.println(salario.getQuantidadeHorasTrabalhadas());
		System.out.println(salario.getValorHora());
		System.out.println(salario.calcularSalario());

	}

}
