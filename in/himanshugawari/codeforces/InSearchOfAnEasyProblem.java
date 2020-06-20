package in.himanshugawari.codeforces;
// 	1030A - In Search of an Easy Problem

import java.util.Scanner;

public class InSearchOfAnEasyProblem {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for (int i = 0; i < n; i++) {
      if (1 == sc.nextInt()) {
        System.out.println("HARD");
        sc.close();
        return;
      }
    }
    System.out.println("EASY");
    sc.close();
  }
}