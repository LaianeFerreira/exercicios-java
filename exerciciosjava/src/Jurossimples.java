import java.util.Scanner;
public class Jurossimples {
	static Scanner ler = new Scanner (System.in);
	
	
		public static void main(String[] args) {
		double valor;
		int parcelas, tx;
		
			System.out.println("Digite o valor da compra: ");
			valor = ler.nextDouble();
			
			System.out.println("Digite a quantidade de parcelas: ");
			parcelas = ler.nextInt();
			
			System.out.println("Digite a taxa: ");
			tx = ler.nextInt();
			
			Calculo(valor, parcelas, tx);

		}
		
		static void Calculo (double vcompra, int parce, int taxa) {
			
			double calc;
			double calc2;
			
			calc = ((vcompra*parce*taxa)/ 100) + vcompra;
			calc2= calc / parce;
			
			
			System.out.printf("Sua compra ficará R$ %.2f em %dx de R$ %.2f por mês", calc, parce, calc2);
			
		}

	}


