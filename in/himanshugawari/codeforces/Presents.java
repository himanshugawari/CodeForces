package in.himanshugawari.codeforces;
// 136A - Presents

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Presents {
  public static void main(String[] args) throws IOException {
    /*
     * Scanner sc = new Scanner(System.in); int n = sc.nextInt(); int[] t = new
     * int[n + 10]; for (int i = 0; i < n; ++i) { t[i] = sc.nextInt(); } sc.close();
     */
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int[] s = new int[n + 10];
    int[] t = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    br.close();
    for (int i = 0; i < n; ++i) {
      s[t[i]] = i + 1;
    }
    for (int i = 1; i <= n; ++i) {
      System.out.print(s[i] + " ");
    }
  }
}