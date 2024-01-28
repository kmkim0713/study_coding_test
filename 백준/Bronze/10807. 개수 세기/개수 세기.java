import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = null;

        ArrayList<Integer> list = new ArrayList<>();

        st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for (int i=0; i<a; i++){
            list.add(Integer.parseInt(st.nextToken()));
        }

        st = new StringTokenizer(br.readLine());
        int targetNum = Integer.parseInt(st.nextToken());

        int result = 0;

        Iterator<Integer> iter = list.iterator();
        while(iter.hasNext()){
            if(iter.next() == targetNum) result++;
        }

        bw.write(result+"");

        bw.flush();

    }
}