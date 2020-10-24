package DS;

public class SearchOperationInArray {
	int arr[] = {1,2,3,4,5,6,7,8,9};
	int count = arr.length; 
	public static void main(String[] args) {
		SearchOperationInArray obj = new SearchOperationInArray();
		
		System.out.println("Value linear : "+ obj.searchLinear(obj.arr, 10));
		System.out.println("Value linear : "+ obj.searchBinary(obj.arr, 10));
		
		obj.printArray(obj.arr);
		System.out.println("After delete");
		obj.deleteElement(obj.arr, 4);
	}
	
	boolean searchLinear(int arr[], int value) {
		
		for(int i = 0; i< arr.length-1; i++) {
			if(arr[i] == value) {
				return true;
			}
		}
		
		return false;
	}
	
	boolean searchBinary(int arr[], int value) {
		
		for(int i = 0 , j= arr.length-1; i <= ((arr.length-1)/2); i++, j--) {
			System.out.println("arr : "+ arr[i] + " "+ arr[j]);
			if(arr[i] == value || arr[j] == value) {
				return true;
			}
		}
		return false;
	}
	
	void printArray(int arr[]) {
		System.out.println("count : "+ count);
		for(int i = 0 ; i< count ;i++) {
			System.out.println("value : "+ arr[i]);
		}
	}
	
	void deleteElement(int arr[], int index) {
	
		if(index < 0 || index > arr.length) {
			throw new IllegalArgumentException();
		}
		
		for(int i = index ; i < arr.length-1 ; i++) {
			arr[i] = arr[i+1];
		}
		count--;
	
		printArray(arr);
	}

}
