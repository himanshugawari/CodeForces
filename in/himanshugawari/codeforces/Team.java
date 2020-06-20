package in.himanshugawari.codeforces;
import java.util.Scanner;

public class Team {
   public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    int counter=0;
    while(t--!=0){
      int count=0;
      int a=sc.nextInt();
      int b=sc.nextInt();
      int c=sc.nextInt();
      if(a>0){
        count++;
      }
      if(b>0){
        count++;
      }
      if(c>0){
        count++;
      }
      if(count>=2){
        counter++;
      }
    }
    System.out.println(counter);
    sc.close();
  }
}