// 133A - HQ9+

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HQ9Plus {
  public static void main(String[] args) throws IOException{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    String s=br.readLine();
    br.close();
    boolean f=false;
    for(int i=0;i<s.length();i++){
      if(s.charAt(i)=='H'){
        f=true;
        break;
      }else if(s.charAt(i)=='Q'){
        f=true;
        break;
      }else if(s.charAt(i)=='9'){
        f=true;
        break;
      }else if(s.charAt(i)=='+'){
        continue;
      }else if(i==s.length()-1){
        f=false;
      }
    }
    if(f){
      System.out.println("YES");
    }else{
      System.out.println("NO");
    }
  }
}