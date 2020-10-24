package logic.building;

import java.util.HashMap;
import java.util.Map;

public class Assignment56 {

	public static void main(String[] args) {
		
		Assignment56 obj = new Assignment56();
		System.out.println(obj.countCapInString("Vivek"));
		System.out.println(obj.countSmallInString("Vivek"));
		System.out.println(obj.countDiffSmallandCAPLetter("Vivek"));
		System.out.println(obj.checkOvalInStr("Vivek"));
		System.out.println(obj.revStr("Vivek"));
		obj.pattern(6, 6);
		obj.countOccChar("vivek");
		
		int arr[] = {5,8,12,4,-8,8,10,2,2,0};
		obj.luckynumber(arr);
		
		System.out.println(obj.printNearestValue(13, arr));
	}
	
	
	private int printNearestValue(int no, int arr[]) {
		int temp = arr[0], value = 0;
		int a = 0;
		for(int i = 0; i< arr.length; i++) {
			if(arr[i] == no) {
				return no;
			}else {
				a = no - arr[i];
				if(a < 0) {
					a = -a;
					if(temp > a) {
						value = arr[i];
						temp = a;
					}
				}else {
					if(temp > a) {
						value = arr[i];
						temp = a;
					}
				}
			}
		}
		
		return value;
		
	}
	
	private void luckynumber(int arr[]) {
		
		for(int i= 1 ; i < (arr.length-1); i++) {
			if((arr[i-1] + arr[i+1])  == arr[i]) {
				System.out.println(arr[i]);
			}
		}
		
	}
	
	private void pattern(int row, int col) {
		
		for(int i = 0 ; i<=row ; i++) {
			int a = 1;
			char b = 'A';
			for(int j = 0 ; j <= col; j++) {
				if(i == j) {
					System.out.print("& ");
				}else if(i == 0 || j == 0 || i == row || j == col) {
					System.out.print("* ");
				}else if(i > j) {
					System.out.print(b+++" ");
				}else {
					System.out.print(a+++" ");
				}
			}
			System.out.println();
		}
	}
	
	private int countCapInString(String str) {
		int count = 0;
		char arr[] = str.toCharArray();
		for(int i = 0 ; i< arr.length; i++) {
			if(arr[i] >= 'A' && arr[i] <= 'Z') {
				count++;
			}
		}
		
		return count;
	}
	
	private int countSmallInString(String str) {
		int count = 0;
		char arr[] = str.toCharArray();
		for(int i = 0 ; i< arr.length; i++) {
			if(arr[i] >= 'a' && arr[i] <= 'z') {
				count++;
			}
		}
		
		return count;
	}
	
	private int countDiffSmallandCAPLetter(String str) {
		int cap = 0, small = 0;
		char arr[] = str.toCharArray();
		for(int i = 0 ; i< arr.length; i++) {
			if(arr[i] >= 'a' && arr[i] <= 'z') {
				small++;
			}else if(arr[i] >= 'A' && arr[i] <= 'Z') {
				cap++;
			}
		}
		
		return (small-cap);
	}
	
	private boolean checkOvalInStr(String str) {
		
		char arr[] = str.toCharArray();
		for(int i = 0 ; i< arr.length; i++) {
			switch(arr[i]) {
				case  'a' :
				case  'A' : 
				case  'e' :
				case  'E' : 
				case  'i' :
				case  'I' : 
				case  'o' :
				case  'O' : 
				case  'u' :
				case  'U' : 
					return true;
				
			}
		}
		
		return false;
	}
	
	private char[] revStr(String str) {
		
		char arr[] = str.toCharArray();
		
		for(int i = 0, j = str.length()-1 ; i < (str.length() /2); i++, j--) {
			char temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
		
		return arr;
	}
	
	private void countOccChar(String str) {
		
		char arr[] = str.toCharArray();
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(int i= 0; i< arr.length; i++) {
			if(map.containsKey(arr[i])) {
				map.put(arr[i], (map.get(arr[i])+1));
			}else {
				map.put(arr[i], 1);
			}
		}
		
		System.out.println(map.toString());
		
	}

}
