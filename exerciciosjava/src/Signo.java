import java.util.Scanner;
public class Signo {
	static Scanner ler = new Scanner (System.in);
	public static void main(String[] args) {
		
		System.out.println("Digite o mês de nascimento e o dia: ");
		String mes = ler.next();
		int dia = ler.nextInt();
		
		Libra(mes, dia);
		
	}
	
	static void Libra (String mes, int dia) {
		
		if ((dia >= 23 && dia <=30) && mes.equalsIgnoreCase("setembro")){
			System.out.println("É de libra");
		}
		else if ((dia >= 1 && dia <=22) && mes.equalsIgnoreCase("outubro")) {
			System.out.println("É de libra");
		}
		else {
			System.out.println("Não é de libra");
		}
	}

}
