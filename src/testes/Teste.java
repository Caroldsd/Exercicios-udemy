package testes;

public class Teste {
	public static void main(String[] args) {
		String texto = "eu AMO meu namorado :3";
		System.out.println(texto);
		System.out.println(texto = texto.concat(" muito muito."));
		System.out.println(texto.contentEquals("eu amo a lisa"));
		System.out.println(texto.indexOf("namorado"));
		System.out.println(texto.toUpperCase());
		System.out.println(texto.toLowerCase());
		System.out.println(texto.isBlank());
		System.out.println(texto.length());
		System.out.println("==");
		Byte b = 100;
		Short s = 1000;
		Integer i = 10000;
		Long l= 100000L;
		
		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i.doubleValue());
		System.out.println(l);

		
	}
}
