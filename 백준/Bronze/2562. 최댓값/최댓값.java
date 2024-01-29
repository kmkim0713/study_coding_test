import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = null;

        ArrayList<Integer> list = new ArrayList<>();

        int index = 0;
        int max = 0;
        int dataCount = 0;

        for (int i =0; i<9; i++) {

            st = new StringTokenizer(br.readLine());
            if (max == 0) {
                max = Integer.parseInt(st.nextToken());
            } else {
                int temp = Integer.parseInt(st.nextToken());
                if (temp > max){
                    max = temp;
                    index = dataCount;
                }
            }
            dataCount++;
        }

        bw.write(String.valueOf(max)+"\n");
        bw.write(String.valueOf(index+1));

        bw.flush();

    }
}