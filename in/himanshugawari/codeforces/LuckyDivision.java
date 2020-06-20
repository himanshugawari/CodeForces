package in.himanshugawari.codeforces;
// 122A - Lucky Division
import java.util.*;

public class LuckyDivision {
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    for(int i=1;i<=n;i++){
      String s=Integer.toString(i);
      boolean isLucky=false;
      for(int j=0;j<s.length();j++){
        if(!(s.charAt(j)=='4' || s.charAt(j)=='7')){
          break;
        }else if(j==s.length()-1){
          isLucky=true;
        }
      }
      if(isLucky){
        if(n%i==0){
          System.out.println("YES");
          break;
        }
      }else if(!isLucky && i==n){
        System.out.println("NO");
      }
    }
    sc.close();
  }
}