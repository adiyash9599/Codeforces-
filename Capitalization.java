import java.util.*;
import java.io.*;

public class Capitalization {
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
        FastReader fr = new FastReader();

        String str = fr.next();
        if (str.charAt(0) >= 'a' && str.charAt(0) <= 'z') {
            str = str.substring(0, 1).toUpperCase() + str.substring(1);
        }
        System.out.println(str);

    }
}
