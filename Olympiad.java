import java.util.*;
import java.io.*;

public class Olympiad {
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
        int result[] = new int[n];

        for (int i = 0; i < n; i++) {
            int days = sc.nextInt();

            int m[] = new int[days];
            int s[] = new int[days];

            for (int j = 0; j < s.length; j++) {
                m[j] = sc.nextInt();
            }
            for (int j = 0; j < s.length; j++) {
                s[j] = sc.nextInt();
            }
            int monoCarp = 0;
            int stereoCarp = 0;

            for (int j = 0; j < days; j++) {
                if (j == days - 1) {
                    monoCarp += m[j];
                } else {
                    if (m[j] > s[j + 1]) {
                        monoCarp += m[j];
                        stereoCarp += s[j + 1];
                    }
                }
            }

            int maxSum = monoCarp - stereoCarp;
            result[i] = maxSum;
        }

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}