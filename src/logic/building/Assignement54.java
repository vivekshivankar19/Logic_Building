package logic.building;

import java.util.Scanner;


public class Assignement54 {

	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		int value = scan.nextInt();
		
		Assignement54 obj = new Assignement54();
		
//		System.out.println(obj.countEvenNumber(value));
//		System.out.println(obj.countOddNumber(value));
//		System.out.println(obj.count3To7Number(value));
//		System.out.println(obj.mulOfNumber(value));
//		System.out.println(obj.diffEvenAndOdd(value));
		
		obj.printFibonasiSeries(10);
		
	}
	
	private int countEvenNumber(int value) {
		int count = 0;
		while(value>0) {
			if((value%10) % 2 == 0) {
				count++;
			}
			value = value/10;
		}
		return count;
	}
	
	private int countOddNumber(int value) {
		int count = 0;
		while(value>0) {
			if((value%10) % 2 != 0) {
				count++;
			}
			
			value = value/10;
		}
		return count;
	}
	
	private int count3To7Number(int value) {
		int count = 0;
		while(value>0) {
			if((value%10) >= 3 && ((value%10) <=7)) {
				count++;
			}
			
			value = value/10;
		}
		return count;
	}
	
	private int mulOfNumber(int value) {
		int mul = 1;
		while(value>0) {
			if((value%10) !=0)
				mul*=(value%10);
			
			value = value/10;
		}
		return mul;
	}
	
	private int diffEvenAndOdd(int value) {
		int even = 0, odd = 0;
		while(value>0) {
			if((value%10) %2 == 0)
				even+=value%10;
			else
				odd+=value%10;
		}
		return (even-odd);
	}
	
	private void printFibonasiSeries(int value) {
		int a = 0, b= 1, temp = 0;
		
		System.out.println(" Printing number");
		
		while(a < value) {
			System.out.println(a+ " ");
			temp = a+b;
			a = b;
			b = temp;
		}
	}

}
