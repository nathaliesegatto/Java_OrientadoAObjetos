package Exercicios_Java;

public class TestaGetESet {
	public static void main(String[] args) {
		contaEncapsulada conta = new contaEncapsulada(1,3);
		conta.setNumero(1337);
		System.out.println(conta.getNumero());

		clienteEncapsulado paulo = new clienteEncapsulado(1,4);
		paulo.setNome("Paulo Silveira");

		conta.setTitular(paulo);

		System.out.println(conta.getTitular().getNome());

		conta.getTitular().setProfissao("Programador");

	}
}
