package repetition_for;

import java.util.Scanner;

public class Exam02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for(int i=1; i<=num; i++) {
			int firNum = sc.nextInt();
			int secNum = sc.nextInt();
			System.out.println(firNum+secNum);
		}
		sc.close();
	}

}

