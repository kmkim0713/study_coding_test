
import java.io.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[N + 1];

        st = new StringTokenizer(br.readLine());

        int arrCount = 0;
        while(st.hasMoreTokens()){
            arr[arrCount] = Integer.parseInt(st.nextToken());
            arrCount++;
        }

        // 투포인터
        int start = 1;
        int end = N;
        int count = 0;

        Arrays.sort(arr);

        while(start < end){

            if(arr[start] + arr[end] < M){
                start++;
            } else if(arr[start] + arr[end] > M){
                end--;
            } else if(arr[start] + arr[end] == M){
                count ++;
                start++;
                end--;
            }

        }
        System.out.println(count);

    }
}
