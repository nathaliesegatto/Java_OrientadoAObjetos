
public class TestaContaSemCliente {
	public static void main(String[] args) {
		contadois contaDaMarcela = new contadois();
		
		contaDaMarcela.titular = new Cliente();
		
		contaDaMarcela.titular.nome = "Marcela";
		System.out.println(contaDaMarcela.titular.nome);
		
	}

}
