import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = null;
        st = new StringTokenizer(br.readLine());
        String text = st.nextToken();

        String reg = "(c=|c-|dz=|d-|lj|nj|s=|z=)";

        text = text.replaceAll(reg,"1");
        bw.write(text.length()+"");


        bw.flush();

    }

}