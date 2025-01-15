import java.util.*;
import java.io.*;
import java.io.InputStreamReader;

public class Borze {
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
        List<Integer> res = new ArrayList<Integer>(str.length());
        int i = 0;

        while (i < str.length()) {
            if (str.charAt(i) == '.') {
                res.add(0);
                i++;
            } else if (i + 1 < str.length() && str.charAt(i) == '-' && str.charAt(i + 1) == '.') {
                res.add(1);
                i += 2;
            } else if (i + 1 < str.length() && str.charAt(i) == '-' && str.charAt(i + 1) == '-') {
                res.add(2);
                i += 2;
            }
        }

        for (Integer integer : res) {
            System.out.print(integer);
        }
    }
}
