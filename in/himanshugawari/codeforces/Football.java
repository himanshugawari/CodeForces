package in.himanshugawari.codeforces;
import java.util.*;

public class Football {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String str=sc.next();
    int count=1;
    char temp=str.charAt(0);
    for(int i=1;i<str.length();i++){
      if(str.charAt(i)==temp){
        count++;
        if(count==7){
          System.out.println("YES");
          break;
        }
      }else{
        temp=str.charAt(i);
        count=1;
      }
      if(i==str.length()-1 && count<7){
        System.out.println("NO");
      }
    }
    sc.close();
  }
}