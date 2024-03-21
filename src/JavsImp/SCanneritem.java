package JavsImp;
import java.util.Scanner;
public class SCanneritem {
public static void main(String[] args) {
	
	Scanner prog = new Scanner(System.in);
	System.out.println("Enter a number: ");
	
	int a = prog.nextInt();
	System.out.println("Entered number is :"+a);
	if(a<=0) {
		System.out.println("negetive");
	}else {
		System.out.println("positive ");
	}
}
}
