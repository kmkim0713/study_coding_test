import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = null;

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        String strNum = st.nextToken();

        int result = 0;

        for (int i = 0 ; i < N; i++){
            result = result + Integer.parseInt(String.valueOf(strNum.charAt(i)));
        }

        bw.write(String.valueOf(result));

        bw.flush();

    }
}