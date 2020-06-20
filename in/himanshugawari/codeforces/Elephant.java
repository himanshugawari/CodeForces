package in.himanshugawari.codeforces;
import java.util.*;

public class Elephant {
  public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   long x=sc.nextLong();
   long min=0;
   for(long i=5;i>0;i--){
     long n=x/i;
     long r=x%i;
     min+=n;
     x=r;
   }
  System.out.println(min);
   sc.close(); 
  }
}