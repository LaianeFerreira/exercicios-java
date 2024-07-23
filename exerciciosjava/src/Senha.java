
import java.util.Scanner;
public class Senha{
 public static void main (String[] args){
 Scanner ler = new Scanner(System.in);
    
   System.out.println("Digite a senha: ");
   String senha = ler.nextLine();

   int senhaA = senha.length();
    
    if (senhaA >= 6){
       System.out.println("Senha forte");
    } 
    else {
       System.out.println("Senha fraca");
    }

   ler.close();
   
 }
}