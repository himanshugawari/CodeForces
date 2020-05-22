import java.util.*;

public class Tram {
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int min=0;
    int ans=0;
    while(n--!=0){
      int a=sc.nextInt();
      int b=sc.nextInt();
      ans=ans-a+b;
      if(min<ans){
        min=ans;
      }
    }
    System.out.println(min);
    sc.close();
  }
}


/*
10
0 5---5
1 7---11
10 8---9
5 3---7
0 5---12
3 3---12
8 8----12
0 6----18
10 1---9
9 0----0
*/