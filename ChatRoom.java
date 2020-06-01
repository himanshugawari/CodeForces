// 58A - Chat room

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChatRoom {
  public static void main(String[] args) throws IOException{
    BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
    String s=b.readLine();
    char[] hello=s.toCharArray();
    char[] t=new char[]{'h','e','l','l','o'};
    StringBuffer sb=new StringBuffer();
    int j=0;
    for(int i=0;i<t.length;i++){
      while(j<hello.length){
        if(t[i]==hello[j]){
          sb.append(hello[j]);
          j++;
          break;
        } 
        j++;       
      }
    }
    if(new String(sb).equals("hello")){
      System.out.println("YES");
    }else{
      System.out.println("NO");
    }
    
  }
}