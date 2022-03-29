
public class CalculadoraFatorial {
	public static void main(String[] args) {
		int n = 4;
		for (int i = n-1;  i > 1; i = i-1) {
		   int fatorial = n*i; 
		   n = fatorial;	   
		   }
		System.out.println("Fatorial = " + n);
	}
}

