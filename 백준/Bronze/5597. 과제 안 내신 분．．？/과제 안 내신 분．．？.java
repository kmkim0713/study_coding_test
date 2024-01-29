import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = null;

        ArrayList<Integer> list = new ArrayList<>();

        for (int a=0; a<=30; a++){
            list.add(a);
        }

        for (int a=1; a<=28; a++){
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            list.set(i,0);
        }

        Collections.sort(list, Collections.reverseOrder());


        bw.write(list.get(1)+"\n");
        bw.write(list.get(0)+"");
        bw.flush();

    }
}