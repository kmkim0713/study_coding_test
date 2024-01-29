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

        st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        ArrayList<Integer> resultList = new ArrayList<>();

        // 바구나에 숫자 채우기
        for (int a = 0; a <= N; a++) {
            resultList.add(a);
        }

        // M번 순서 바꾸기
        for (int a = 0; a < M; a++) {
            st = new StringTokenizer(br.readLine());

            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());

            while(i<j){
                int temp = resultList.get(i);
                resultList.set(i++,resultList.get(j));
                resultList.set(j--,temp);
            }
        }

        for (int c = 1; c <= N; c++) {
            bw.write(resultList.get(c) + " ");
        }

        bw.flush();

    }
}