package Exercicios_Java;

public class contadois {
	private double saldo;
	int agencia;
	private int numero;
	cliente titular;

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
	
	public double acessaSaldo() {
		return this.saldo;
	}
	
	
		
		
		}

