import java.io.*;
import java.math.BigInteger;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    static BigInteger count = new BigInteger("2");
    static StringBuilder sb = new StringBuilder(); // 맨 처음에 count값 출력을 위해 사용

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        if (n <= 20){
            hanoi(n, 1, 3, 2);
            count = count.pow(n).subtract(BigInteger.ONE);
            bw.write(count+"\n");
            bw.write(sb.toString());
        }else {
            count = count.pow(n).subtract(BigInteger.ONE);
            bw.write(count+"\n");
        }
        bw.flush();
        bw.close();

    }


    public static void hanoi(int n, int start, int end, int mid) {

        /*count = count.add(BigInteger.valueOf(1));*/
        if (n == 1) {
            sb.append(start + " " + end + "\n");
        } else {
            hanoi(n - 1, start, mid, end);
            sb.append(start + " " + end + "\n");
            hanoi(n - 1, mid, end, start);
        }
    }

}