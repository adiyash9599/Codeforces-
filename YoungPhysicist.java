import java.util.*;
import java.io.*;
import java.io.InputStreamReader;
import java.io.IOException;

public class YoungPhysicist {
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
    }

    public static void main(String[] args) {
        FastReader sc = new FastReader();

        int n = sc.nextInt();
        int sumx = 0, sumy = 0, sumz = 0;

        for (int i = 0; i < n; i++) {
            sumx += sc.nextInt();
            sumy += sc.nextInt();
            sumz += sc.nextInt();
        }

        if (sumx == 0 && sumy == 0 && sumz == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}