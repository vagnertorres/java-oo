package br.com.exercicio.oo.bean;

public class ContaBancaria implements java.io.Serializable {
	
	private double saldo;
	private int agencia;
	private String numeroConta;
	
	public ContaBancaria() {}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public int getAgencia() {
		return agencia;
	}
	
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	
	public String getNumeroConta() {
		return numeroConta;
	}
	
	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}	
}
