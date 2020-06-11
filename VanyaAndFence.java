// 677A - Vanya and Fence

import java.util.Scanner;

public class VanyaAndFence {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int h = sc.nextInt();
    int[] p = new int[n];
    for (int i = 0; i < n; i++) {
      p[i] = sc.nextInt();
    }
    sc.close();
    int w = 0;
    for (int i = 0; i < n; i++) {
      if (p[i] > h) {
        w += 2;
      } else {
        w++;
      }
    }
    System.out.println(w);
  }
}