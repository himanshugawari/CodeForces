import java.util.*;

public class BearAndBigBrother {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int i=0;
    while(i<Integer.MAX_VALUE){
      a*=3;
      b*=2;
      if(a>b){
        i++;
        break;
      }else{
        i++;
      }
    }
    System.out.println(i);
    sc.close();
  }
}