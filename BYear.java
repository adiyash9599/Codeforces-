import java.util.*;
import java.io.*;
import java.io.InputStreamReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashSet;

public class BYear {

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

    public static boolean hasDistinctDigits(String str) {
        Set<Character> set = new HashSet<>();
        for (Character character : str.toCharArray()) {
            if (!set.add(character)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        FastReader fr = new FastReader();
        int y = fr.nextInt();
        if (y < 1000) {
            return;
        }

        for (int i = y + 1; i <= 9000; i++) {
            String str = Integer.toString(i);
            // if (str.charAt(0) != str.charAt(1) && str.charAt(1) != str.charAt(2) &&
            // str.charAt(2) != str.charAt(3)
            // && (str.charAt(0) != str.charAt(2)) && (str.charAt(0) != str.charAt(3))
            // && (str.charAt(1) != str.charAt(3))) {
            // System.out.println(Integer.parseInt(str));
            // break;
            // }

            if (hasDistinctDigits(str)) {
                System.out.println(Integer.parseInt(str));
                break;
            }
        }
    }
}