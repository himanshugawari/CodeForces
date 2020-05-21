import java.util.*;
public class BoyOrGirl {
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String str=sc.next();
    int[] arr=new int[256];
    for(int i=0;i<str.length();i++){
      int j=str.charAt(i);
      arr[j]++;
    }
    int count=0;
    for(Integer z:arr){
      if(z>0){
        count++;
      }
    }
    if(count%2==0){
      System.out.print("CHAT WITH HER!");
    }else{
      System.out.print("IGNORE HIM!");
    }
    sc.close();
  }
}