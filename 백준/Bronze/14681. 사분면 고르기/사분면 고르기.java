import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;


public class Main {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int b = Integer.parseInt(st.nextToken());

        if (a > 0 && b > 0) {
            bw.write("1");
        } else if (a < 0 && b > 0) {
            bw.write("2");
        } else if (a < 0 && b < 0) {
            bw.write("3");
        } else if(a > 0 && b < 0){
            bw.write("4");
        }

        bw.flush();
    }
}