// 59A - Word

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Word {
  public static void main(String[] args) throws IOException{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    String s=br.readLine();
    int up=0,low=0;
    for(int i=0;i<s.length();i++){
      if(Character.isUpperCase(s.charAt(i))){
        up++;
      }else if(Character.isLowerCase(s.charAt(i))){
        low++;
      }
    }
    if(up>low){
      System.out.println(new String(s.toUpperCase()));
    }else{
      System.out.println(new String(s.toLowerCase()));
    }
    br.close();
  }
}