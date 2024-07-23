import java.util.Scanner;
public class Juroscompostos {
	static Scanner ler = new Scanner (System.in);
	
	public static void main(String[] args) {
		double valor, tx;
		int parcelas;
		
			System.out.println("Digite o valor da compra: ");
			valor = ler.nextDouble();
			
			System.out.println("Digite a quantidade de parcelas: ");
			parcelas = ler.nextInt();
			
			System.out.println("Digite a taxa: ");
			tx = ler.nextInt();
		
			Calculo(valor,parcelas,tx);
		
	}
	
	static void Calculo (double vCompra, int parcelas, double taxa) {
		double montante, calc2;
		
		taxa = taxa/100;
		montante = vCompra * (Math.pow((1 + taxa), parcelas));
		
		calc2 = montante / parcelas;
		
		System.out.printf("Sua compra ficará R$ %.2f em %dx de R$ %.2f por mês", montante, parcelas, calc2);
	}
	
	

}
