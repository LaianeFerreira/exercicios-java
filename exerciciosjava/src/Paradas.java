import java.util.Scanner;
public class Paradas {

		public static void main(String[] args) {
			Scanner ler = new Scanner (System.in);
			double capTanque, consumo, km, calc, calc2;
			
			System.out.println("Capacidade do tanque: ");
			capTanque = ler.nextDouble();
			
			System.out.println("Consumo do veículo: ");
			consumo = ler.nextDouble();
			
			System.out.println("Km da viagem: ");
			km = ler.nextDouble();
			
			calc = capTanque * consumo; 
			
			calc2 = calc / km;
			
			System.out.println("Paradas: " + calc2);
			
			
			
			}

	}


