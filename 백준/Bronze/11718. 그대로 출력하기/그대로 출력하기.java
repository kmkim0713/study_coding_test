import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = null;
        ArrayList<String> strArrList = new ArrayList<>();

        String input = "";
        while((input = br.readLine()) != null){
            strArrList.add(input);
        }

        Iterator ite = strArrList.iterator();

        while(ite.hasNext()){
            bw.write(ite.next()+"\n");
        }

        bw.write("\n");
        bw.flush();

    }

}