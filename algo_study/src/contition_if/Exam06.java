package contition_if;

import java.util.Scanner;

public class Exam06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int res = 0;
		if (num1 > num2) {
			if (num1 > num3) {
				if (num2 > num3)
					res = num2;
				else
					res = num3;
			} else
				res = num1;
		} else if (num2 > num3) {
			if (num1 > num3)
				res = num1;
			else
				res = num3;
		} else
			res = num2;
		System.out.println(res);
		sc.close();
	}

}
