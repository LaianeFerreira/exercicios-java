import java.util.Scanner;
public class Hipotenusa{
 public static void main (String[] args){
 Scanner ler = new Scanner(System.in);
   double num1, num2, num3, calc;
   
   System.out.println("Digite um numero: ");
   num1 = ler.nextDouble();

   System.out.println("Digite outro numero: ");
   num2 = ler.nextDouble();
   
   num3 = Math.pow(num1, 2) + Math.pow(num2, 2);
   
   calc = Math.sqrt(num3);
   
   System.out.println("A hipotenusa é: " + calc );
   
   
		   
    ler.close();
   
 }
}