package repetition_for;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Exam09 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] temp = br.readLine().split(" ");
		String[] num = br.readLine().split(" ");
		for (int i = 0; i < Integer.parseInt(temp[0]); i++) {
			if (Integer.parseInt(num[i]) < Integer.parseInt(temp[1])) {
				bw.write(Integer.parseInt(num[i])+" ");
			}
		}
		bw.flush();
		bw.close();
	}
}
