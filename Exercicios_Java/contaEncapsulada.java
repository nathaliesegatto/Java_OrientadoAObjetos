package Exercicios_Java;

public class contaEncapsulada {
	private double saldo;
	int agencia;
	private int numero;
	private clienteEncapsulado titular;
	private static int totalDeContas = 1;

	public contaEncapsulada(int agencia, int numero) {
		this.agencia = agencia;
		this.numero = numero;
		if (agencia <= 0) {
			System.out.println("Digite uma ag�ncia v�lida.");
		} else {
			if (numero <= 0) {
				System.out.println("Digite uma conta v�lida.");
			} else {
				System.out.println("Conta criada com sucesso.");
				System.out.println("Agencia: " + agencia);
				System.out.println("Conta: " + numero);
				System.out.println();
				System.out.println("Total de contas criadas: " + totalDeContas);
				totalDeContas++;
			}
		}

	}

	public void deposita(double valor) {
		this.saldo = this.saldo + valor;
	}

	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo = this.saldo - valor;
			return true;
		} else {
			return false;
		}
	}

	public boolean transfere(double valor, Conta destino) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		}
		return false;
	}

	// M�TODO PARA MOSTRAR SALDO
	public double getSaldo() {
		return this.saldo;
	}

	// M�TODO PARA ACESSAR N�MERO DA CONTA
	public int getNumero() {
		return this.numero;
	}

	// M�TODO PARA ALTERAR N�MERO DA CONTA
	public void setNumero(int numero) {
		this.numero = numero;
		if (numero <= 0) {
			System.out.println("Valor deve ser maior que zero.");
			return;
		}
	}

	// M�TODO PARA ACESSAR O N�MERO DA AG�NCIA
	public int getAgencia() {
		return this.agencia;
	}

	// M�TODO PARA ALTERAR O N�MERO DA AG�NCIA
	public void setAgencia(int agencia) {
		this.agencia = agencia;
		if (agencia <= 0) {
			System.out.println("Valor deve ser maior que zero.");
			return;
		}
	}

	// M�TODO PARA ACESSAR O TITULAR
	public clienteEncapsulado getTitular() {
		return titular;
	}

	// M�TODO PARA ALTERAR O TITULAR
	public void setTitular(clienteEncapsulado titular) {
		this.titular = titular;
	}

	public static int getTotal() {
		return totalDeContas;

	}

}