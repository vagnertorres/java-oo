package br.com.exercicio.oo;

public class Salario {
	
	private double quantidadeHorasTrabalhadas;
	private double valorHora;
	
	Salario() { }
	
	Salario(double quantidadeHorasTrabalhadas, double valorHora) {
		
		this.quantidadeHorasTrabalhadas = quantidadeHorasTrabalhadas;
		this.valorHora = valorHora;
	}
	
	public double getQuantidadeHorasTrabalhadas() {
		
		return quantidadeHorasTrabalhadas;
	}
	
	public void setQuantidadeHorasTrabalhadas(double quantidadeHorasTrabalhadas) {
		
		this.quantidadeHorasTrabalhadas = quantidadeHorasTrabalhadas;
	}
	
	public double getValorHora() {
		
		return valorHora;
	}
	
	public void setValorHora(double valorHora) {
		
		this.valorHora = valorHora;
	}
	
	public double calcularSalario() {
		
		double salarioTotal = this.quantidadeHorasTrabalhadas * this.valorHora;
		
		return salarioTotal;
	}

}
