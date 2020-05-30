//	110A - Nearly Lucky Number
import java.util.*;

public class NearlyLuckyNumber {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    long n=sc.nextLong();
    String s=Long.toString(n);
    int count=0;
    for(int i=0;i<s.length();i++){
      if(!(s.charAt(i)=='4' || s.charAt(i)=='7')){
        System.out.println("NO");
        break;
      }else{
        count++;
      }
      if(i==s.length()-1 && (count==4 || count==7)){
        System.out.println("YES");
      }
    }
    sc.close();
  }
}