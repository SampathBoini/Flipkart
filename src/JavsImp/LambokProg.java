package JavsImp;

public class LambokProg {

	private int practice;
	private String res;
	private	double sal;
	private double hike;
	
	public int getPractice() {
		return practice;
	}

	public void setPractice(int practice) {
		this.practice = practice;
	}

	public String getRes() {
		return res;
	}

	public void setRes(String res) {
		this.res = res;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	public double getHike() {
		return hike;
	}

	public void setHike(double hike) {
		this.hike = hike;
	}

	public static void main(String[] args) {
		
		LambokProg prog = new LambokProg();
		
		prog.setPractice(9);
		prog.setRes("job");
		prog.setSal(1500000);
		prog.setHike(500000);
		
		System.out.println(prog.getPractice());
		System.out.println(prog.getRes());
		System.out.println(prog.getSal());
		System.out.println(prog.getHike());
		
		
		
		
		
		
		
		
	}
}
