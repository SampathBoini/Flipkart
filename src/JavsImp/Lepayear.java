package JavsImp;

import java.util.Scanner;

public class Lepayear {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("enter any year : ");
	 int year = sc.nextInt();
	
	if(year%400 ==0) {
		System.out.println("leap year");
	}else if(year%4==0) {
		System.out.println("leap year");
	}else {
		System.out.println("not leap year");
	}
}
}
