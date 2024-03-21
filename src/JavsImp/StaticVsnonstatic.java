package JavsImp;



class Demo{
	static String name = "sampath";
	int id = 5;

	public void Stat() {
			System.out.println(name);
			System.out.println(id);
			
	}
	public static void nonStat() {
		System.out.println(name);
		Demo dm = new Demo();
		System.out.println(dm.id);
		  

	}


}
    

    public class StaticVsnonstatic {

    	public static void main(String[] args) {

    		Demo dm = new Demo();
          dm.Stat();
          dm.nonStat();
    		
    		
		}
}
