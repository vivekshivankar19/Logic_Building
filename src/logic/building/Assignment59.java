package logic.building;

public class Assignment59 {

	public static void main(String[] args) {
		Assignment59 obj = new Assignment59();
		obj.printPattern("Hello");
		obj.print("Hello");
		obj.print1("Hello");
		obj.print2("Hello");
		obj.print3("Hello");
		
		obj.countWords();
		obj.coutnAndRevWords();
		obj.transformMatrix();
	}
	
	int arr2[][] = {{3,2,5,9}, {4,3,2,2}, {8,4,1,5}, {3,9,7,5}};
	
	private void transformMatrix() {
		System.out.println(arr2[0].length);
		
		
		for(int i= 0; i< arr2.length; i++) {
			for(int j=0 ; j<arr2.length; j++) {
				System.out.print(arr2[j][i]+" ");
			}
			System.out.println();
		}
	}
	
	private void coutnAndRevWords() {
		String str = " abc xyz rty ";
		char arr[] = str.toCharArray();
		System.out.println(" ================== "+ arr.length);
		int count = 0;
		for(int  i = 0; i < arr.length; i++ ) {
			
			if(arr[i] == ' ') {
				while((i < arr.length) && (arr[i] != ' ')) {
					i++;
				}
			}else if((i < arr.length) && (arr[i] != ' ')) {
				int c = i;
				count++;
				char temp;
				while((i < arr.length) && (arr[i] != ' ')) {
					i++;
				}
				for(int k = c, j = i-1; k < (i/1); k++, j--) {
					if(k > j) {
						break;
					}
					temp = arr[k];
					arr[k] = arr[j];
					arr[j] = temp;
				}
				
			}
		}
		
		
		int arr1[][] = {{1,2,3}, {1,2,3}};
		int sum = 0;
		for(int i= 0 ; i< arr1.length; i++) {
			sum = 0;
			int j= 0;	
			while(j < arr1[i].length) {
				sum+=arr1[i][j++];
			}
			System.out.println(sum);
		}
		
		System.out.println(arr);
	}
	
	
	
//	H e l l o
//	H e l l o
//	H e l l o
//	H e l l o
	
	private void printPattern(String str) {
		char arr[] = str.toCharArray();
		
		for(int i = 0 ; i < arr.length; i++) {
			for(int j = 0; j< arr.length; j++) {
				System.out.print(arr[j]+" ");
			}
			System.out.println();
		}
	}
	
//	H e l l o
//	H e l l
//	H e l
//	H e
//	H
	
	private void print(String str) {
		System.out.println(" ================== ");
		char arr[] = str.toCharArray();
		for(int  i = arr.length-1; i > 0; i-- ) {
			for(int j = 0 ; j < i ; j++) {
					System.out.print(arr[j]+" ");
			}
			System.out.println();
		}
		
	}
	
//	H 
//	H e 
//	H e l 
//	H e l l 
//	H e l l o 
	private void print1(String str) {
		System.out.println(" ================== ");
		char arr[] = str.toCharArray();
		
		for(int  i = 0; i < arr.length; i++ ) {
			for(int j = 0 ; j <= i ; j++) {
					System.out.print(arr[j]+" ");
			}
			System.out.println();
		}
		
	}
	
//	H e l l o
//	H e l l
//	H e l
//	H e
//	H
//	H e
//	H e l
//	H e l l
//	H e l l 0
	
	private void print2(String str) {
		System.out.println(" ================== ");
		char arr[] = str.toCharArray();
		
		for(int  i = 0; i < (arr.length *2); i++ ) {
			if(i < arr.length) {
				for(int j = 0 ; j <= i ; j++) {
						System.out.print(arr[j]+" ");
				}
			}else {
				for(int k = 0 ; k < ((arr.length*2 -1)-i) ; k++) {
					System.out.print(arr[k]+" ");
			}
			}
			System.out.println();
		}	
	}
	
//	H
//	H e
//	H e l
//	H e l l
//	H e l l o
//	H e l l
//	H e l
//	H e l
//	H e
//	H
	
	private void print3(String str) {
		System.out.println(" ================== ");
		char arr[] = str.toCharArray();
		
		for(int  i = 0; i < (arr.length *2); i++ ) {
			if(i > arr.length) {
				for(int j = 0 ; j < (arr.length-i) ; j++) {
						System.out.print(arr[j]+" ");
				}
			}else {
				for(int k = 0 ; k <= (i-arr.length) ; k++) {
					System.out.print(arr[k]+" ");
			}
			}
			System.out.println();
		}	
	}
	
	
	private void countWords() {
		String str = " abc def xyz ";
		char arr[] = str.toCharArray();
		System.out.println(" ================== "+ arr.length);
		int count = 0;
		for(int  i = 0; i < arr.length; i++ ) {
			
			if(arr[i] == ' ') {
				while((i < arr.length) && (arr[i] != ' ')) {
					i++;
				}
			}else if((i < arr.length) && (arr[i] != ' ')) {
				count++;
				while((i < arr.length) && (arr[i] != ' ')) {
					i++;
				}
			}
		}
		
		System.out.println("Total words is : " + count);
	}

}
