import java.util.*;

public class SoldierandBananas {
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int k=sc.nextInt();
    long n=sc.nextLong();
    int w=sc.nextInt();
    int total=0;
    for(int i=1;i<=w;i++){
      total+=(i*k);
    }
    if(n>total){
      System.out.println(0);
    }else{
      System.out.println(Math.abs(n-total));
    }
    sc.close();
  }  
}