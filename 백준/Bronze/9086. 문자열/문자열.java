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

        int n = Integer.parseInt(st.nextToken());

        ArrayList<String> resultList = new ArrayList<>();

        for (int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            String temp = st.nextToken();
            resultList.add(temp);
        }

        for(String item: resultList){

            bw.write(String.valueOf(item.charAt(0)) + String.valueOf(item.charAt(item.length()-1))+"\n");
        }

        bw.flush();

    }
}