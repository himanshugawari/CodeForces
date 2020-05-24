//1360B - Honest Coach
import java.util.*;

public class HonestCoach {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0){
      int n=sc.nextInt();
      int[] arr=new int[n];
      for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
      }
      int res=Math.abs(arr[1]-arr[0]);
      for(int i=0;i<n-1;i++){
        for(int j=i+1;j<n;j++){
          res=Math.min(res, Math.abs(arr[j]-arr[i]));
        }
      }
      System.out.println(res);
    }
    sc.close();
  }
}