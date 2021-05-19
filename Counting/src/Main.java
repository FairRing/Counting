import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader bufferReader = new BufferedReader( new InputStreamReader(System.in) );
        BufferedWriter bufferWriter = new BufferedWriter( new OutputStreamWriter(System.out) );


        int N = Integer.parseInt(bufferReader.readLine());
        int[] arr = new int[N];
        StringTokenizer token = new StringTokenizer(bufferReader.readLine());

        for (int i = 0; i < N; i++)
            arr[i] = Integer.parseInt(token.nextToken());

        int v = Integer.parseInt(bufferReader.readLine());
        int cnt = 0;

        for (int i = 0; i < N; i++)
            if(arr[i] == v) cnt++;

        // OUTPUT
        bufferWriter.write(cnt + "\n");


        bufferWriter.flush();
        bufferReader.close();
        bufferWriter.close();
    }
}