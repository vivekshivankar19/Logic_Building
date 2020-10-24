package opps;


public class Array {

	public static void main(String[] args) {
		Array  obj = new Array();
		
		obj.oneDimArray();
		
		obj.dubleDimArray();
	}
	
	// single array
	void oneDimArray() {
		int arr[] = {1,2,3,4,5};
		int[] arr1 = new int[10];
		
		for(int i =0; i< arr.length ; i++) {
			System.out.println(" loop1 "+ i + arr[i]);
		}
		
		for(int i = 0; i< 2 ; i++) {
			arr1[i] = i+10;
		}
		for(int i =0; i< arr1.length ; i++) {
			System.out.println(" loop2 "+ i + arr1[i]);
		}
	}
	
	void dubleDimArray() {
		int arr[][] = {{1,2}, {3,4}};
		int arr1[][] = new int[2][2];
		
		for(int i =0; i< arr.length ; i++) {
			System.out.println(" loop3 "+ i + arr[i][i]);
		}
		
		for(int i = 0; i< 2 ; i++) {
			arr1[i][i] = i+10;
		}
		for(int i =0; i< arr1.length ; i++) {
			System.out.println(" loop4 "+ i + arr1[i][i]);
		}
		
	}

}
