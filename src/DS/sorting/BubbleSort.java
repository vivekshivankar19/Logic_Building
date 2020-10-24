package DS.sorting;

import java.util.Scanner;

class Bubble{
	public void sort(int arr[]) {
		int temp =0;
		for(int i =0; i < arr.length; i++) {
			
			for(int j= 0 ; j < arr.length-1-i; j++) {
				if(arr[j] > arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
}

public class BubbleSort {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array : ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		
		System.out.println("Enter values : ");
		for(int i = 0; i< size; i++) {
			arr[i] = sc.nextInt();
		}
		
		Bubble obj = new Bubble();
		obj.sort(arr);
		
		System.out.println("Array after sorting is: ");
		for(int i = 0; i< size; i++) {
			System.out.println(arr[i]);
		}
		
	}

}
