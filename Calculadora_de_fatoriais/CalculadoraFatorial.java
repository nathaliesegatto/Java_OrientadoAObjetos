package Calculadora_de_fatoriais;

public class CalculadoraFatorial {
	public static void main(String[] args) {
		long n = 15;
		for (long i = n-1;  i > 1; i = i-1) {
		   long fatorial = n*i; 
		   n = fatorial;	   
		   }
		System.out.println("Fatorial = " + n);
	}
}

