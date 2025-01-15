import java.util.*;
import java.io.*;
import java.io.InputStreamReader;
import java.io.IOException;

public class Queue {
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        char nextChar() {
            return next().charAt(0);
        }
    }

    public static void main(String[] args) {
        FastReader fr = new FastReader();

        int n = fr.nextInt();
        int t = fr.nextInt();

        String que = fr.next();
        char[] arr = que.toCharArray();

        for (int i = 0; i < t; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] == 'B' && arr[j + 1] == 'G') {
                    arr[j] = 'G';
                    arr[j + 1] = 'B';
                    j++;
                }
            }
        }

        System.out.println(new String(arr));

    }
}