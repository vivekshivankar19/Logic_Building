package logic.building;

public class Assignment62 {

	static int arr2[][] = {{3,2,5,9}, {4,3,2,2}, {8,4,1,9}, {3,9,7,5}};
	static int arr3[][] = {{1,0,0,0}, {0,1,0,0}, {0,0,1,0}, {0,0,0,1}};
	static int arr4[][] = {{1,1,1,1}, {0,1,1,1}, {0,0,1,0}, {0,0,0,1}};
	public static void main(String[] args) {
	
		Assignment62 obj = new Assignment62();

		obj.transformMatrix();
		obj.reverseRowContentMatrix();
		obj.printMatrix(arr2);
		obj.reverseColContentMatrix();
		obj.printMatrix(arr3);
		obj.checkIndenticalMatrix();
		obj.checkSquareMatrix(arr4);
	}
	
	
	
	private void printMatrix(int arr2[][]) {
		System.out.println("===== Orgininal Matriz =========");
		for(int i= 0; i< arr2.length; i++) {
			for(int j=0 ; j<arr2.length; j++) {
				System.out.print(arr2[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	private void transformMatrix() {
		
		for(int i= 0; i< arr2.length; i++) {
			for(int j=0 ; j<arr2.length; j++) {
				System.out.print(arr2[j][i]+" ");
			}
			System.out.println();
		}
	}
	
	private void reverseRowContentMatrix() {
		System.out.println("======= Reverse ROW content =======");
		for(int i= 0; i< arr2.length; i++) {
			for(int j=arr2.length-1 ; j >= 0; j--) {
				System.out.print(arr2[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	private void reverseColContentMatrix() {
		System.out.println("======= Reverse COL content =======");
		for(int i= arr2.length-1; i >=0; i--) {
			for(int j=0 ; j < arr2.length; j++ ) {
				System.out.print(arr2[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	
	
	private void checkIndenticalMatrix() {
		System.out.println("======= Reverse Identical Matrix =======");
		
		
		for(int i= 0; i < arr3.length; i++) {
			for(int j=0; j< arr3.length; j++) {
				if(i == j) {
					if((! (arr3[i][j] == 1))) {
						System.out.println(" Matrix is noy identical");
						return;
					}
				}else if(!  ((i != j) && (arr3[i][j] == 0))){
					System.out.println(" Matrix is not identical");
					return;
				}
			}
		}
		System.out.println("Matrix is identical...!!");
	}
	
	private void checkSquareMatrix(int arr3[][]) {
		System.out.println("======= Reverse Square Matrix =======");
		int zeroCount = 0, nonZeroCount = 0;
		
		for(int i= 0; i < arr3.length; i++) {
			for(int j=0; j< arr3.length; j++) {
				if(arr3[i][j] == 0) {
					zeroCount++;
				}else {
					nonZeroCount++;
				}
			}
		}
		if(zeroCount > nonZeroCount) {
			System.out.println("Matrix is Square...!!");
		}else {
			System.out.println("Matrix is not Square...!!");
		}
	}

}
