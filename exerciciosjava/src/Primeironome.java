import java.util.Scanner;
public class Primeironome {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String nome, nomec;
		
		System.out.println("Digite seu nome completo: ");
		nomec = ler.nextLine();
		
		nome = nomec.substring(0, nomec.indexOf(" "));
		
		System.out.println("Bem-Vindo(a)," + nome + "!");
		ler.close();
	}

}
