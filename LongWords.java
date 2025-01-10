import java.util.*;
import java.io.*;

public class LongWords {
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
        String[] words = new String[n];
        for (int i = 0; i < words.length; i++) {
            words[i] = sc.next();
        }

        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > 10) {
                System.out.println(
                        words[i].charAt(0) + "" + (words[i].length() - 2) + (words[i].charAt(words[i].length() - 1)));
            } else {
                System.out.println(words[i]);
            }
        }

        // Important Learning
        /*
         * In Java, when you concatenate different data types, the "" (empty string)
         * acts as a conversion mechanism.
         * Let's break down what happens without and with the "":
         * Without "":
         * In this case, words[i].charAt(0) is a character, and (words[i].length() - 2)
         * is an integer.
         * When you add a character and an integer, Java performs numeric addition,
         * which converts the
         * character to its ASCII/Unicode numeric value. This results in a numeric
         * output.
         * 
         * With "":
         * The "" forces string concatenation. When you add an empty string to anything,
         * it converts that thing to a string. So now:
         * 
         * First character becomes a string
         * Integer becomes a string
         * Last character becomes a string
         * 
         */
    }
}