package repetition_while;

import java.util.Scanner;

public class Exam02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()) {
			System.out.println(sc.nextInt()+sc.nextInt());
		}
	}

}