package repetition_for;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Exam06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		try {
			for (int i = num; i >= 1; i--) {
				bw.write(i + "\n");
			}bw.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
