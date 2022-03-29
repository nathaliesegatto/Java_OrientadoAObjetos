package Exercicios_Java;

public class TesteSacaValoresNegativos {
	public static void main(String[] args) {
		contadois conta = new contadois();
		conta.deposita(100);
		System.out.println(conta.saca(101));

		conta.saca(101);

		System.out.println(conta.acessaSaldo());

	}
}
