import java.util.Scanner;

public class Abnt {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String autor, obra, cidade, editora;
        int ano;
        
        System.out.print("Digite o nome do autor: ");
        autor = ler.nextLine();
        System.out.print("Digite o nome da obra: ");
        obra = ler.nextLine();
        System.out.print("Digite o nome da cidade: ");
        cidade = ler.nextLine();
        System.out.print("Digite o nome da editora: ");
        editora = ler.nextLine();
        System.out.print("Digite o ano de lançamento: ");
        ano = ler.nextInt();
        
        System.out.println(autor.toUpperCase()+", " + obra+ ". " + cidade +": "+ editora + ", " + ano);
        
        
    }
}