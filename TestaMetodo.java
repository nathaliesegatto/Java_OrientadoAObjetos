
public class TestaMetodo {
	public static void main(String[] args) {
		Conta contaDoPaulo = new Conta();
		contaDoPaulo.saldo = 100;
		
		contaDoPaulo.deposita(50);
				
		boolean conseguiuSacar = contaDoPaulo.saca(20);
		System.out.println("Saldo restante = R$ " + contaDoPaulo.saldo);	
		
		if (conseguiuSacar = true) {
			System.out.println("Transação realizada com sucesso");
		} else {
			System.out.println("Saldo insuficiente!");
		}
		
		Conta contaDaMarcela = new Conta();
		contaDaMarcela.deposita(1000);
		
		if (contaDaMarcela.transfere(300 , contaDoPaulo)) {
			System.out.println("Transferência realizada com sucesso.");
		} else {
			System.out.println("Saldo insuficiente.");
		}
		System.out.println(contaDaMarcela.saldo);		
		System.out.println(contaDoPaulo.saldo);
		
		contaDoPaulo.titular = "Paulo Silveira";
		System.out.println(contaDoPaulo.titular);
		
	}

}
