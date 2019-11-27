package repetition_while;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Exam01 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		while(true) {
			String[] temp = br.readLine().split(" ");
			if(Integer.parseInt(temp[0])==0 && Integer.parseInt(temp[1])==0)
				break;
			bw.write(Integer.parseInt(temp[0])+Integer.parseInt(temp[1])+"\n");			
		}bw.flush();
		bw.close();
}
}
