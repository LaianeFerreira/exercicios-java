import java.util.Scanner;
public class Imc {

		public static void main(String[] args) {
			Scanner ler = new Scanner (System.in);
			double peso, alt, pot, calc;
			System.out.print("Informe a altura: ");
			alt = ler.nextDouble();
			
			System.out.print("Informe o peso: ");
			peso = ler.nextDouble();
			
			
			
			pot = Math.pow(alt, 2);
			
			calc = peso / pot;
		
			System.out.printf("Seu IMC é: %.1f", calc);
			
		ler.close();

		}

	}


