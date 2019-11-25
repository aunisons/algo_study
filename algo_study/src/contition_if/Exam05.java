package contition_if;

import java.util.Scanner;

public class Exam05 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int hour = scan.nextInt();
		int min = scan.nextInt();
		min-=45;
		if(min<0) {
			min+=60;
			hour-=1;
			if(hour<0)
			hour+=24;
		}
		System.out.println(hour+" "+min);
		scan.close();

}
}
