package repetition_for;

import java.io.*;

public class Exam04 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		try {
			int n = Integer.parseInt(br.readLine());
			for(int i=1; i<=n; i++) {
				String[] temp = br.readLine().split(" ");
				bw.write(Integer.parseInt(temp[0])+Integer.parseInt(temp[1])+"\n");
			}
			bw.flush();
		}catch (Exception e) {
			// TODO : handle exception
			e.printStackTrace();
		}
}
}
