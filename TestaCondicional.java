public class TestaCondicional {
	public static void main(String[] args) {
		System.out.println("Testando Condiconais");
		int idade = 18;
		int quantidadePessoas = 2;
		if (idade >= 18) {
			System.out.println("Voc� tem mais de 18 anos!");
			System.out.println("Seja bem-vindo!");
		} else {
			if (quantidadePessoas >= 2) {
				System.out.println("Voc� � menor, mas pode entrar pois est� acompanhado.");
			} else {
				System.out.println("Infelizmente, voc� n�o pode entrar.");
			}
		}

	}

}
