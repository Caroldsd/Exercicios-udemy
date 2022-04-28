package udemy.operadores;

public class DesafioAritmeticos {
	
	public static void main(String[] args) {
		
		double operacao1 = 6 *(3 + 2);
		operacao1 = Math.pow(operacao1 , 2);
		operacao1 = operacao1 / (3 * 2);
		
		double operacao2 = ((1 - 5) * (2 - 7)) /2;
		operacao2 = Math.pow(operacao2, 2);
		
		double operacao3 = operacao1 - operacao2;
		operacao3 = Math.pow(operacao3, 3);
		
		double operacao4 = operacao3 / (int) Math.pow(10, 3);
		
		System.out.println((int) operacao4);
	}
}
