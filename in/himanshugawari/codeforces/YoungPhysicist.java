package in.himanshugawari.codeforces;
// 69A - Young Physicist
import java.util.*;

public class YoungPhysicist {
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    int[][] arr=new int[t][3];
    for(int i=0;i<t;i++){
      for(int j=0;j<3;j++){
        arr[i][j]=sc.nextInt();
      }
    }
    int res=0;
    for(int i=0;i<3;i++){
      int a=0;
      for(int j=0;j<t;j++){
        a+=arr[j][i];
      }
      if(a==0){
        res++;
      }else{
        break;
      }
    }
    if(res==3){
      System.out.println("YES");
    }else{
      System.out.println("NO");
    }
    sc.close();
  }
}