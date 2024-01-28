import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;


public class Main{
    public static void main(String args[]) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int sum = a + b;
        int sub = a - b;
        int mul = a*b;
        int div = a / b;
        int re = a%b;
        bw.write(String.valueOf(sum) + "\n");
        bw.write(String.valueOf(sub) + "\n");
        bw.write(String.valueOf(mul) + "\n");
        bw.write(String.valueOf(div) + "\n");
        bw.write(String.valueOf(re) + "\n");
        bw.flush();

    }
}