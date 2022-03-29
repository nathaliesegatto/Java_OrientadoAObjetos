
public class TestaWhile {
	public static void main(String[] args) {
		int contador;
		contador = 0 ;
		int total = 0;
		while (contador <= 10) {
			total = total + contador;
			contador++;
		}
		System.out.println(total);
	}
}

