import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;


public class Main {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        if (a==b && b==c && b==c){
            bw.write(String.valueOf(10000 + a*1000));
        } else if (a != b && a != c && b != c){
            int temp = 0;
            if (a>=b){
                if (a>=c){
                    temp = a;
                } else if(c>a){
                    temp = c;
                }
            } else if (b>a){
                if (b>=c){
                    temp = b;
                } else if(c>b){
                    temp = c;
                }
            }
            bw.write(String.valueOf(temp*100));
        } else {
            int temp = 0;
            if (a==b){
                temp = a;
            } else if (b==c){
                temp = b;
            } else if (a==c){
                temp = c;
            }
            bw.write(String.valueOf(1000 + temp*100));
        }

        bw.flush();
    }
}