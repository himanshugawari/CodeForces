//1360A - Minimal Square
import java.util.*;
public class MinimalSquare {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0){
      int a=sc.nextInt();
      int b=sc.nextInt();
      if(a>b){
        b+=b;
        if(b>a){
          System.out.println(b*b);
        }else{
          System.out.println(a*a);
        }
      }else{
        a+=a;
        if(a>b){
          System.out.println(a*a);
        }else{
          System.out.println(b*b);
        }
      }
    }
    sc.close();
  }
}