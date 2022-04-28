package udemy;

public class Exercicios {
	
	public static void main(String[] args) {
		
		double a = 1; // conv implícita
		System.out.println(a);
		
		float b = (float) 1.123456788888; // conv explícita(cast)
		System.out.println(b);
		
		int c = 100;
		byte d = (byte) c; // explícita(cast)
		System.out.println(d);
		
		double e = 1.99999;
		int f = (int) e; //explícita(cast)
		System.out.println(f);
	}
}
