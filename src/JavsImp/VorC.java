package JavsImp;

import java.util.Scanner;

public class VorC {
public static void main(String[] args) {
	 
	   char ch;
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter any chatracter: ");
	  ch= sc.nextLine().charAt(4);
	  
	  if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
		  System.out.println("It is an Vowel!");
	  }else {
		  System.out.println("It is a consonent!");
	  }
}
}
