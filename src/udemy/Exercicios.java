package udemy;

public class Exercicios {
	
	public static void main(String[] args) {
		
		double a = 1; // conv impl�cita
		System.out.println(a);
		
		float b = (float) 1.123456788888; // conv expl�cita(cast)
		System.out.println(b);
		
		int c = 100;
		byte d = (byte) c; // expl�cita(cast)
		System.out.println(d);
		
		double e = 1.99999;
		int f = (int) e; //expl�cita(cast)
		System.out.println(f);
	}
}
