import java.util.*;
import java.io.*;
import java.io.InputStreamReader;
import java.io.IOException;

public class LightsOut {
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

    public static void change(int[][] lights, int i, int j) {
        if (lights[i][j] == 0) {
            lights[i][j] = 1;
        } else {
            lights[i][j] = 0;
        }
    }

    public static void main(String[] args) {
        FastReader fr = new FastReader();

        int[][] lights = new int[3][3];
        int[][] input = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                lights[i][j] = 1;
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                input[i][j] = fr.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (input[i][j] % 2 != 0) {
                    lights[i][j] = 1 - lights[i][j];
                    if (i > 0)
                        lights[i - 1][j] = 1 - lights[i - 1][j];
                    if (i < 2)
                        lights[i + 1][j] = 1 - lights[i + 1][j];
                    if (j > 0)
                        lights[i][j - 1] = 1 - lights[i][j - 1];
                    if (j < 2)
                        lights[i][j + 1] = 1 - lights[i][j + 1];
                }
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(lights[i][j]);
            }
            System.out.println();
        }

    }
}