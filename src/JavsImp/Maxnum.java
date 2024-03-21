package JavsImp;

import java.util.Scanner;

public class Maxnum {
public static void main(String[] args) {
	   
	
	Scanner sc = new Scanner(System.in);
	System.out.println("enter a number: ");
 int a =	sc.nextInt();
 
 Scanner sc1 = new Scanner(System.in);
	System.out.println("enter a number: ");
int b =	sc1.nextInt();
 
Scanner sc2 = new Scanner(System.in);
System.out.println("enter a number: ");
int c =	sc2.nextInt();

	
	if(a>b && a>c) {
		System.out.println(a);
	}else if(b>a &&  b>c) {
		System.out.println(b);
	}else {
		System.out.println(c);
	}
	
	
}
}
