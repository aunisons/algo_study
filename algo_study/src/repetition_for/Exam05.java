package repetition_for;

import java.io.*;

public class Exam05 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		try {
		int num = Integer.parseInt(br.readLine());
		for(int i=1; i<=num; i++) {
		bw.write(i+"\n");
		}
		bw.flush();
		bw.close();
	}catch(Exception e) {
		e.printStackTrace();
	}
}
}
