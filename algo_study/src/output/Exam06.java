package output;

import java.util.Scanner;

public class Exam06 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		System.out.println(num1*(num2%10));
		System.out.println(num1*(num2/10%10));
		System.out.println(num1*(num2/100));
		System.out.println(num1*num2);
	}

}
