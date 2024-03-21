package JavsImp;
import java.util.Scanner;
public class PositiveorNegetive {

	public static void main(String[] args) {
		Scanner lol = new Scanner(System.in);
		System.out.println("enter a number: ");
		
		int i = lol.nextInt();
		if(i>=0) {
			System.out.println("positive");
		}else {
			System.out.println("negetive");
		}
	}
}
