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

        String a = st.nextToken();

        st = new StringTokenizer(br.readLine());
        String b = st.nextToken();

        int result01 = Integer.parseInt(a) * Integer.parseInt(String.valueOf(b.charAt(2)));
        int result02 = Integer.parseInt(a) * Integer.parseInt(String.valueOf(b.charAt(1)));
        int result03 = Integer.parseInt(a) * Integer.parseInt(String.valueOf(b.charAt(0)));

        int result04 = result01+result02*10+result03*100;

        bw.write(String.valueOf(result01)+"\n");
        bw.write(String.valueOf(result02)+"\n");
        bw.write(String.valueOf(result03)+"\n");
        bw.write(String.valueOf(result04)+"\n");
        bw.flush();

    }
}