import java.util.Scanner;
public class Semestre {
	static Scanner ler = new Scanner (System.in);
	public static void main(String[] args) {
		
		System.out.println("Digite o semestre: ");
		int semestre = ler.nextInt();
		
		Semestre(semestre);
		
	}
	
	static void Semestre (int semes) {
		
		if (semes == 1){
			System.out.println("É primeiro semestre");
		}
		else {
			System.out.println("Não é primeiro semestre");
		}
	}

}
