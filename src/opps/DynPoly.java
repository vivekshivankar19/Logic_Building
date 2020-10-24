package opps;

public class DynPoly extends Polymophism{

	public static void main(String[] args) {
			
		DynPoly obj = new DynPoly();
		System.out.println("Addtion : "+obj.add(1, 2));
		System.out.println("Addtion : "+obj.add(1, 2, 3));

	}
	
	int add(int a, int b, int c) {
		return a+b+c;
	}

}
