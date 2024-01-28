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

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        int result01 = (A+B)%C;
        int result02 =  ((A%C) + (B%C))%C;
        int result03 =  (A*B)%C;
        int result04 =  ((A%C) * (B%C))%C;


        bw.write(String.valueOf(result01)+"\n");
        bw.write(String.valueOf(result02)+"\n");
        bw.write(String.valueOf(result03)+"\n");
        bw.write(String.valueOf(result04)+"\n");
        bw.flush();

    }
}