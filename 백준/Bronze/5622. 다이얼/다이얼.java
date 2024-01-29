import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int count = 0;
		// 3 4 5 6 7 8 9 10
		String alpha = br.readLine();
		alpha = alpha.toUpperCase();
		char[] alpha_array = alpha.toCharArray();
//	
		for (int i = 0; i < alpha_array.length; i++) {
			int temp = (int) alpha_array[i] - 65;
			if ((temp >= 0) && (temp <= 2)) {

				count += 3;
			}
			else if ((temp >= 3) && (temp <= 5)) {

				count += 4;
			}
			else if((temp>=6)&&(temp<=8)) {
				
				count+=5;
			}
			else if((temp>=9)&&(temp<=11)) {
				
				count+=6;
			}
			else if((temp>=12)&&(temp<=14)) {
				
				count+=7;
			}
			else if((temp>=15)&&(temp<=18)) {
				
				count+=8;
			}
			else if((temp>=19)&&(temp<=21)) {
				
				count+=9;
			}
			else if((temp>=22)&&(temp<=25)) {
				
				count+=10;
			}
		
		

		}
		System.out.println(count);

	}
}