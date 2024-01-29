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


        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 바구니
        int M = Integer.parseInt(st.nextToken()); // 횟수

        for (int a=0; a<=N; a++){
            list.add(0);
        }

        for (int a=0; a<M; a++) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            for (int b=i; b<=j; b++){
                list.set(b,k);
            }
        }

        for (int a=1; a<=N; a++){
            bw.write(list.get(a)+" ");
        }


        bw.flush();

    }
}