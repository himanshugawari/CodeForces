import java.util.*;

public class StringTask {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String str=sc.next();
    char[] v=new char[]{'A','a','E','e','O','o','Y','y','U','u','I','i'};
    boolean flag=false;
    for(int i=0;i<str.length();i++){
      flag=false;
      for(int j=0;j<v.length;j++){
        if(str.charAt(i)==v[j]){
          flag=true;
        }
      }
      if(flag!=true){
        System.out.print("."+Character.toLowerCase(str.charAt(i)));
      }
    }
    sc.close();
  }
}