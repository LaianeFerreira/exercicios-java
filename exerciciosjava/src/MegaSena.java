import java.util.Random;
public class MegaSena {

	public static void main(String[] args) {
		Random r = new Random();
		int num [] = new int [6];		
		
		for (int i = 0; i<=num.length -1; i++) {
			num[i] = r.nextInt(100);
			System.out.print(num[i]+" ");
		}
		

	}

}
