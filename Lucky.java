import java.util.*;
import java.io.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.io.InputStreamReader;

public class Lucky {
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

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

    public static void main(String[] args) {
        FastReader fr = new FastReader();

        long n = fr.nextLong();
        int countLucky = 0;

        String str = Long.toString(n);
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '4' || str.charAt(i) == '7') {
                countLucky++;
            }
        }

        String str2 = Integer.toString(countLucky);
        boolean isLucky = true;
        for (int i = 0; i < str2.length(); i++) {
            if (str2.charAt(i) != '4' && str2.charAt(i) != '7') {
                isLucky = false;
                break;
            }
        }

        if (isLucky) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
