import java.util.*;
import java.io.*;

public class Journey {
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
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
    }

    static long getDistance(int[] arr, long steps) {
        long cycles = steps / 3;
        long remaining = steps % 3;
        long distance = cycles * (arr[0] + arr[1] + arr[2]);

        for (int i = 0; i < remaining; i++) {
            distance += arr[i];
        }
        return distance;
    }

    public static void main(String[] args) {
        // FastReader fr = new FastReader();
        // int t = fr.nextInt();
        // int result[] = new int[t];

        // for (int k = 0; k < t; k++) {
        // int n = fr.nextInt();
        // int j = 0, counter = 0;
        // int journey = 0;
        // int[] arr = new int[3];

        // for (int i = 0; i < arr.length; i++) {
        // arr[i] = fr.nextInt();
        // }

        // while (counter != n && counter < n) {
        // journey += arr[j];
        // counter++;
        // j++;
        // if (j == 3) {
        // j = 0;
        // }
        // if (journey == n || journey > n) {
        // result[k] = counter;
        // break;
        // }
        // }
        // }

        // for (int i = 0; i < result.length; i++) {
        // System.out.print(result[i] + " ");
        // }

        // --> upper code not work it fails in the time limit: 1 sec

        FastReader fr = new FastReader();

        int t = fr.nextInt();

        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            long n = fr.nextLong();
            int[] arr = new int[3];
            for (int i = 0; i < 3; i++) {
                arr[i] = fr.nextInt();
            }

            // initialize binary search boundaries
            // left: minimum steps(1)
            // right: max possible steps (n * 3) -> for worst cases
            long left = 1, right = n * 3;
            long answer = -1;

            while (left <= right) {
                long mid = left + (right - left) / 2;
                long distance = getDistance(arr, mid);

                if (distance >= n) {
                    answer = mid;
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            sb.append(answer).append("\n");
        }

        System.out.print(sb);
    }
}
