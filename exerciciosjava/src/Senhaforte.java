import java.util.Scanner;
public class Senhaforte {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		System.out.println("digite a senha: ");
		String senha = ler.nextLine();
		
		if (senha.contains("!") ||
			senha.contains("@") ||
			senha.contains("#") ||
			senha.contains("$") ||
			senha.contains("%") ||
			senha.contains("^") ||
			senha.contains("&")) {
			System.out.println("Senha forte");
		}
		else {
			System.out.println("senha fraca");
		}
		

	}

}
