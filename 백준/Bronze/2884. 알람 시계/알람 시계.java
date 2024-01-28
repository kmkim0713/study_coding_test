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

        int hour = Integer.parseInt(st.nextToken());
        int minute = Integer.parseInt(st.nextToken());

        if (hour > 0 && minute >= 45){
            bw.write(String.valueOf(hour) + " " + String.valueOf(minute - 45));
        } else if (hour > 0 && minute < 45){
            bw.write(String.valueOf(hour - 1) + " " + String.valueOf(minute - 45 + 60));
        } else if (hour == 0 && minute >= 45){
            bw.write(String.valueOf(hour) + " " + String.valueOf(minute - 45));
        } else if (hour == 0 && minute < 45){
            bw.write(String.valueOf(23) + " " + String.valueOf(minute - 45 + 60));
        }



        bw.flush();
    }
}