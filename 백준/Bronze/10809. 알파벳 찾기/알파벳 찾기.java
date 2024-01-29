import javax.swing.text.TextAction;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = null;

        st = new StringTokenizer(br.readLine());
        String text = st.nextToken();

        ArrayList<Integer> textAsciiList = new ArrayList<>();

        // a는 97

        for(int i = 0; i < text.length(); i++){
            textAsciiList.add((int)text.charAt(i)-97);
        }

        ArrayList<Integer> resultList = new ArrayList<>();
        for(int i = 0; i < 26; i++){
            resultList.add(-1);
        }
        
        for(int i = 0; i < textAsciiList.size(); i++){

            if(resultList.get(textAsciiList.get(i)) == -1){
                resultList.set(textAsciiList.get(i), i);
            }
        }

        for(int i = 0; i < resultList.size(); i++){
            bw.write(resultList.get(i)+" ");
        }


        bw.flush();

    }
}