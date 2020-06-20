package in.himanshugawari.codeforces;
import java.util.*;

public class BerlandPoker {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0){
      int n=sc.nextInt();
      int m=sc.nextInt();
      int k=sc.nextInt();
      int card=n/k;
      int ans=0;
      if(card<m){
        ans=card;
        m=m-card;
        int temp;
        k--;
        if(m%k==0){
          temp=m/k;
        }else{
          temp=m/k+1;
        }
        ans=ans-temp;
      }else{
        ans=m;
      }
      System.out.println(ans);
    }
    sc.close();
  }
}