package in.himanshugawari.codeforces;
import java.util.Scanner;

public class BitPlusPlus {
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int posCounter=0;
    int negCounter=0;
    while(n--!=0){
      String str=sc.next();
      for(int i=0;i<str.length();i++){
        if(str.charAt(i)=='+'){
          posCounter++;
        }else if(str.charAt(i)=='-'){
          negCounter--;
        }
      }
    }
    System.out.println(posCounter/2+negCounter/2);
    sc.close();
  }
}