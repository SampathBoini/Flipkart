package JavsImp;

public class Switchcondi {
 
	public void switches() {
                int a= 26;
                switch(a) {
                case 1:System.out.println("no");
                break;
                case 2: System.out.println("no");
                break;
                case 3: System.out.println("no");
                break;
                case 25: System.out.println("yes");
                break;
             default : System.out.println("ponile");
                break;
                }
                
                              }
	public static void main(String[] args) {
		Switchcondi prog = new Switchcondi();
		prog.switches();
		
	}
	}

