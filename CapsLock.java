//131A - cAPS lOCK

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CapsLock {
  public static void main(String[] args) throws IOException{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    String s=br.readLine();
    br.close();
    int c=0,d=0;
    for(int i=0;i<s.length();i++){
      if(Character.isUpperCase(s.charAt(i))){
        c++;
      }
    }
    boolean isAllUpperCase=false;
    if(c==s.length()){
      isAllUpperCase=true;
    }
    for(int i=0;i<s.length();i++){
      if(Character.isLowerCase(s.charAt(0))){
        if(Character.isUpperCase(s.charAt(i))){
          d++;
        }
      } 
    }
    boolean isLowerUpperCase=false;
    if(d==s.length()-1){
      isLowerUpperCase=true;
    }
    if(isAllUpperCase || isLowerUpperCase){
      for(int i=0;i<s.length();i++){
        System.out.print(Character.isUpperCase(s.charAt(i))?Character.toLowerCase(s.charAt(i)):Character.toUpperCase(s.charAt(i)));
      }
    }else{
      System.out.println(s);
    }
  }
}