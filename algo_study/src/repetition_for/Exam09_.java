package repetition_for;

import java.util.Scanner;

public class Exam09_ {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int min = sc.nextInt();
		int[] data = new int[n];
		for(int i=0; i<data.length; i++) {
			data[i] = sc.nextInt();
		}
		for(int i=0; i<data.length; i++) {
			if(data[i]<min) {
				System.out.print(data[i]+" ");
			}
		}
		
	}

}
