package udemy;

import java.util.Scanner;

public class DesafioConversao {
	 
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe o primeiro salário: ");
		String num1 = teclado.nextLine().replace(',', '.');
		System.out.println("Informe o segundo salário: ");
		String num2 = teclado.nextLine().replace(',', '.');
		System.out.println("Informe o terceiro salário: ");
		String num3 = teclado.nextLine().replace(',', '.');

		double salario1 = Double.parseDouble(num1);
		double salario2 = Double.parseDouble(num2);
		double salario3 = Double.parseDouble(num3);

		double media = ((salario1 + salario2 + salario3) /3);
		System.out.printf("%.2f" , media);
		
		teclado.close();
	}
}
