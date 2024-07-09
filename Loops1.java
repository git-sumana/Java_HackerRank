import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());
        for(int i = 1; i <= 10; i++) { // Loop from 1 to 10
            int result = N * i;
            System.out.printf("%d x %d = %d\n", N, i, result);
        }

        bufferedReader.close();
    }
}
