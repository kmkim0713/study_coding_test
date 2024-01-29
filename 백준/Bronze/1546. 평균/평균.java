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
        int N = Integer.parseInt(st.nextToken()); // 과목수

        st = new StringTokenizer(br.readLine()); // 점수

        ArrayList<Float> resultList = new ArrayList<>();

        for (int a = 0; a < N; a++) {
            int score = Integer.parseInt(st.nextToken());
            resultList.add(score*1.0f);
        }

        Float max = Collections.max(resultList);

        for (int a = 0; a < N; a++) {
            float temp = resultList.get(a) * 1.0f;
            resultList.set(a, temp / max * 100);
        }

        // 새 평균구하기
        float sum = 0;
        for (int a = 0; a < N; a++) {
            sum = sum + resultList.get(a);
        }

        float result = (sum)/N;

        bw.write(result + "");
        bw.flush();

    }
}