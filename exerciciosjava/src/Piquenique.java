import java.util.Scanner;
public class Piquenique {
	static Scanner ler = new Scanner (System.in);
		
		public static void main(String[] args) {
			
			System.out.println("Qual a temperatura: ");
			double num = ler.nextDouble();
			
			temperatura(num);

		}
		
		static void temperatura (double num) {
			
			if (num >= 23 && num <= 30) {
				System.out.println("Pode ir ao parque");
			}
			else {
				System.out.println("Não pode ir ao parque");
			}
			
		}
		
}