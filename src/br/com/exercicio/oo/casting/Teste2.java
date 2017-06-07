package br.com.exercicio.oo.casting;

public class Teste2 {

	public static void main(String[] args) {
		
		Object obj1 = obterString();
		String s = (String) obj1; // downcasting
		
		Object obj2 = "minha string"; //upcasting
		String s2 = (String) obj2; //downcasting
		
		Object obj3 = new Object();
		String s3 = (String) obj3;
		
		Object obj4 = obterInteiro();
		String s4 = (String) obj4;
		
		//OBS: o downcasting funciona apenas se você estiver referenciando aquele tipo em particular.

	}
	
	public static String obterString() {
		return "minha string";
	}
	
	public static int obterInteiro() {
		return 1;
	}

}
