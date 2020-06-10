// 136A - Presents

import java.util.Scanner;

public class Presents {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] t = new int[n + 10];
    int[] s = new int[n + 10];
    for (int i = 0; i < n; ++i) {
      t[i] = sc.nextInt();
    }
    sc.close();
    for (int i = 0; i < n; ++i) {
      s[t[i]] = i + 1;
    }
    for (int i = 1; i <= n; ++i) {
      System.out.print(s[i] + " ");
    }
  }
}