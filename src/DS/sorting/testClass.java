package DS.sorting;

public class testClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		testClass obj = new testClass();
		int a = obj.maximum(-4, -2, -3);
		System.out.println(a);
		 a = obj.maximum(-90, 1, -40);
		System.out.println(a);
	}
	
	int maximum(int no1, int no2, int no3) {
		if(no1 > no2) {
			if(no1 > no3) {
				return no1;
			}else {
				return no3;
			}
		}else if( no2 > no3) {
			return no2;
		}else {
			return no3;
		}
	}
	
	int maximum1(int no1, int no2, int no3) {
		if(no1 > no2 && no1 > no3) {
			return no1;
		}else {
			if(no2 > no3) {
				return no2;
			}else {
				return no3;
			}
		}
	}

}
