package opps;

public class StringClass {

	public static void main(String[] args) {
		
		String a = "vivek";
		char b[] = {'h', 'e', 'm', 'a'};
		String c = "vivek";
		String d = new String(b);
		
		System.out.println("Value of : " + (a ==c));
		System.out.println("Value of : " + d + "  "+ b[0]);
		
	}

}
