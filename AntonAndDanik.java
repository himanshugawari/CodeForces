// 734A - Anton and Danik
import java.util.*;

public class AntonAndDanik{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    long n=sc.nextLong();
    String s=new String(sc.next());
    sc.close();
    int a=0,d=0;
    for(int i=0;i<n;i++){
      if(s.charAt(i)=='A'){
        a++;
      }else{
        d++;
      }
    }
    if(a>d){
      System.out.println("Anton");
    }else if(a<d){
      System.out.println("Danik");
    }else{
      System.out.println("Friendship");
    }
  }
}