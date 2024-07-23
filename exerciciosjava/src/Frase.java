import java.util.Scanner;

public class Frase {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		System.out.println("escreva um frase: ");
		String frase = ler.nextLine();
		
		
		String fraseA;
		fraseA = frase.replace("a", "i");
		fraseA = fraseA.replace("e", "i");
		fraseA = fraseA.replace("o", "i");
		fraseA = fraseA.replace("u", "i");
		
		
		System.out.println(fraseA);

		ler.close();
	}

}
