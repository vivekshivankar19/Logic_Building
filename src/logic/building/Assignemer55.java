package logic.building;

public class Assignemer55 {

	public static void main(String[] args) {
		Assignemer55 obj = new Assignemer55();
		int arr[] = {85, 66, 3, 80, 93, 88};
		System.out.println(" Diff is : "+  obj.difference(arr));
		obj.displayDivFive(arr);
		obj.displayDivFiveOrThree(arr);
		obj.displayDivFiveWithEven(arr);
		obj.displayMulOfEleven(arr);
		
		System.out.println(obj.checkArmstrong(153));
				
	}
	
	public int difference(int arr[]) {
		int even = 0, odd =0;
		
		for(int i = 0 ; i< arr.length ; i++) {
			if(arr[i]%2 == 0) {
				even+=arr[i];
			}else {
				odd+=arr[i];
			}
		}
		
		return (even-odd);
	}
	
	
	private void displayDivFive(int arr[]) {
		System.out.println(" Number divisible by 5");
		for(int i= 0; i< arr.length; i++) {
			if(arr[i]%5 == 0) {
				System.out.print(arr[i] + " ");
			}
		}
		System.out.println("");
	}
	
	private void displayDivFiveWithEven(int arr[]) {
		System.out.println(" Number divisible by 5 and even number");
		for(int i= 0; i< arr.length; i++) {
			if((arr[i]%5 == 0) && (arr[i] %2 == 0)) {
				System.out.print(arr[i] + " ");
			}
		}
		System.out.println("");
	}
	
	private void displayDivFiveOrThree(int arr[]) {
		System.out.println(" Number divisible by 5 and 3");
		for(int i= 0; i< arr.length; i++) {
			if((arr[i]%5 == 0) || (arr[i] %3 == 0)) {
				System.out.print(arr[i] + " ");
			}
		}
		System.out.println("");
	}
	
	private void displayMulOfEleven(int arr[]) {
		System.out.println(" Number divisible by 11");
		for(int i= 0; i< arr.length; i++) {
			if(arr[i]%11 == 0) {
				System.out.print(arr[i] + " ");
			}
		}
		System.out.println("");
	}
	
	
	private boolean checkArmstrong(int value) {
		int temp = value, newNum = 0;
		
		while(value> 0) {
			int v = value%10;
			newNum+= (v*v*v);
			value = value/10;
		}
		
		if(newNum == temp) {
			return true;
		}else {
			return false;
		}
	}

}
