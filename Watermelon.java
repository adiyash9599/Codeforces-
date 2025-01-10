import java.util.*;
import java.io.*; // For BufferedReader

public class Watermelon {
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

    public static void main(String[] args) throws IOException {
        // First way to take input -> Common and Versatile
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // if (n % 2 == 0 && n > 2) {
        // System.out.println("YES");
        // } else {
        // System.out.println("NO");
        // }
        // sc.close();

        // Second way to tqke input -> BufferedReader

        // BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // String input = reader.readLine();
        // System.out.println(input);
        // reader.close();

        // Console input for passwords
        // Console console = System.console();
        // if (console == null)
        // System.out.println("No console");

        // String username = console.readLine("Enter username: ");
        // char[] password = console.readPassword("Enter password: ");

        // for (int i = 0; i < password.length; i++)
        // System.out.print(password[i]);

        // for (int i = 0; i < password.length; i++)
        // password[i] = '

        // System.out.println

        // for (int i = 0; i < password.length; i++)

        // Ultra efficient way to take input -> for Competitive Programming

        FastReader sc = new FastReader();
        int n = sc.nextInt();
        if (n % 2 == 0 && n > 2) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}