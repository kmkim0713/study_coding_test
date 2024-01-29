import javax.swing.text.TextAction;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        StringTokenizer st = null;

        String text = br.readLine().trim();

        if (text.isBlank()){
            bw.write(0+"");
        }else {
            String[] textArr = text.split("\\s");
            bw.write(textArr.length + "");
        }

        bw.write("\n");

        bw.flush();

    }
}