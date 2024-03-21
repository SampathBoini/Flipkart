package JavsImp;
import java.util.*;
public class Amstrong {
public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number to check amstrong or not :");
	int num = sc.nextInt();
	int backup = num;
	int sum =0;
	 while(num>0) {
		 sum = sum+(num%10)*(num%10)*(num%10);
		 num=num/10;
		 
	 }
	if(sum == backup) {
		System.out.println("Amstrong");
	}else {
		System.out.println("not amstrong");
	}
	   
}
}
