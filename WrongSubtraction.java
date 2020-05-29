import java.util.*;

public class WrongSubtraction {
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    long n=sc.nextLong();
    int k=sc.nextInt();
    while(k-->0){
      long r=n%10L;
      if(r!=0){
        n--;
      }else{
        n/=10;
      }
    }
    System.out.println(n);
    sc.close();
  }
}