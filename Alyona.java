import java.util.*;
import java.io.*;
import java.util.StringTokenizer;
import java.io.InputStreamReader;
import java.io.IOException;

public class Alyona {
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
        int testCases = sc.nextInt();
        int[] result = new int[testCases];

        for (int i = 0; i < testCases; i++) {
            int x = sc.nextInt();

            int arr[] = new int[x];
            int sum = 0;
            int days = 0;
            for (int j = 0; j < arr.length; j++) {
                arr[j] = sc.nextInt();
                sum += arr[j];

                if (sum % 2 != 0) {
                    int sqrt = (int) Math.sqrt(sum);
                    if (sqrt * sqrt == sum) {
                        days++;
                    }
                }
            }
            result[i] = days;
        }
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }

    }
}
