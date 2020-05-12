import java.util.*;

class Main {
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int w=sc.nextInt();
    if(w<=3){
      System.out.println("NO");
    }else if(w>=4 && w%2==0){
      System.out.println("Yes");
    }else{
      System.out.println("NO");
    }
    sc.close();
  }
}