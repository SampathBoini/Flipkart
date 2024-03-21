package JavsImp;

public class ifConditions {
 
 public void firstOne() {
	 int a = 5;
           int b= 9;
           if(a + b == 13) {
        	   System.out.println("no man");
           }else if(a + b ==12) {
        	   System.out.println("Yes man");
           }else if(a + b ==14) {
        	   System.out.println("u r ryt");
           }
	}
	
	 public static void main(String[] args) {
		 ifConditions prog = new ifConditions();
		 
		 prog.firstOne();
	}
}
