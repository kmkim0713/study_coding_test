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

        int count = Integer.parseInt(st.nextToken());


        for (int i = 1; i <= count; i++) {
            String text = "";
            String result = "";
            for(int j = 0; j<i; j++){
                text = text + "*";
                result = String.format("%"+String.valueOf(count)+"s",text);
            }
            bw.write(result+"\n");
        }
        bw.flush();

    }
}