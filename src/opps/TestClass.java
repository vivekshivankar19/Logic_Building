package opps;

public class TestClass extends Abstract1 {

	public static void main(String[] args) {
		
		TestClass obj = new TestClass();
		
		System.out.println("Addition is : " + obj.add(1, 2));
		System.out.println("Addition is : " + obj.sub(1, 2));
		System.out.println("Addition is : " + obj.mul(1, 2));
		
	}

	@Override
	int add(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}

}
