package in.himanshugawari.codeforces;
import java.util.*;
public class HelpfulMaths {
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    String[] arr=str.split("\\+");
    Arrays.sort(arr);
    for (int i=0;i<arr.length;i++){
      if(i<arr.length-1){
        System.out.print(arr[i]+"+");
      }else{
        System.out.print(arr[i]);
      }
    }
    sc.close();
  }
}