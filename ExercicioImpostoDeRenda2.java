public class ExercicioImpostoDeRenda2 {
	public static void main(String[] args) {
		double salario = 4000.0;
		if (salario >= 1900.0 && salario <= 2800.0) {
			double i = salario * 0.075;
			double d = 142.0;
			System.out.println("O Imposto de Renda é: R$ " + i);
			System.out.println("A dedução é de até: R$ " + d);
			
		} else {
			if (salario > 2800.0 && salario <= 3751.0) {
				double i = salario * 0.15;
				double d = 350.0;
				System.out.println("O Imposto de Renda é: R$ " + i);
				System.out.println("A dedução é de até: R$ " + d);
				
			} else {
				if (salario > 3751.0 && salario <= 4664.0) {
					double i = salario * 0.225;
					double d = 636.0;
					System.out.println("O Imposto de Renda é: R$ " + i);
					System.out.println("A dedução é de até: R$ " + d);
				}

			}
		}
	}
}