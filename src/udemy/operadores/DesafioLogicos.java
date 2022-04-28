package udemy.operadores;

public class DesafioLogicos {

	public static void main(String[] args) {
		
		boolean trabalho1 = false;
		boolean trabalho2 = false;
		
		boolean tv50 = trabalho1 && trabalho2;
		boolean tv32 = trabalho1 ^ trabalho2;
		
		boolean sorvete = trabalho1 || trabalho2;
		boolean maisSaudavel = !sorvete;
		boolean emCasa = !trabalho1 && !trabalho2;
		
		System.out.println("O trabalho 1 deu certo: " + trabalho1);
		System.out.println("O trabalho 1 deu certo: " + trabalho2);
		System.out.println("Comprou a TV de 50\": " + tv50);
		System.out.println("Comprou a TV de 32\": " + tv32);
		System.out.println("Tomaram sorvete: " + sorvete);
		System.out.println("Mais saudável: " + maisSaudavel);
		System.out.println("Ficaram em casa: " + emCasa);
	}
}
