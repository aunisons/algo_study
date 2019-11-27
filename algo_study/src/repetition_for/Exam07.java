package repetition_for;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Exam07 {
	public static void main (String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int num = Integer.parseInt(br.readLine());
		for(int i=1; i<=num; i++) {
			String[] temp = br.readLine().split(" ");
			bw.write("Case #"+i+": "+(Integer.parseInt(temp[0])+Integer.parseInt(temp[1]))+"\n");
		}
		bw.flush();
		bw.close();
	}

}
