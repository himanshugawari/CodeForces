package in.himanshugawari.codeforces;
import java.util.*;

public class TheatreSquare {
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    double n=sc.nextDouble();
    double m=sc.nextDouble();
    double a=sc.nextDouble();
    double t1=Math.ceil(n/a);
    double t2=Math.ceil(m/a);
    System.out.println(Math.round(t1*t2));
    sc.close();
  }
}