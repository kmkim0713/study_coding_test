import javax.swing.text.TextAction;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = null;

        st = new StringTokenizer(br.readLine());
        String a = st.nextToken();
        String b = st.nextToken();

        int numA = Integer.parseInt(changeNum(a));
        int numB = Integer.parseInt(changeNum(b));

        if (numA >= numB){
            bw.write(numA+"");
        } else {
            bw.write(numB+"");
        }

        bw.write("\n");

        bw.flush();

    }

    public static String changeNum(String num){
        char temp01 = num.charAt(0);
        char temp02 = num.charAt(1);
        char temp03 = num.charAt(2);
        char[] resultArr = {temp03, temp02, temp01};
        return String.valueOf(resultArr);
    }

}