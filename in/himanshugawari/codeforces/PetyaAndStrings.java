package in.himanshugawari.codeforces;
import java.util.*;

public class PetyaAndStrings {
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String str1=sc.nextLine();
    String str2=sc.nextLine();
    char[] arr1=new char[str1.length()];
    char[] arr2=new char[str2.length()];
    for(int i=0;i<str1.length();i++){
      arr1[i]=Character.toLowerCase(str1.charAt(i));
      arr2[i]=Character.toLowerCase(str2.charAt(i));
    }
    int counter=0;
    for(int i=0;i<str1.length();i++){
      if(arr1[i]<arr2[i]){
        System.out.println(-1);
        break;
      }else if(arr1[i]>arr2[i]){
        System.out.println(1);
        break;
      }else{
        counter++;
      }
    }
    if(counter==str1.length()){
      System.out.println(0);
    }
    sc.close();
  }
}