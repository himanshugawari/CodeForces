// 271A - Beautiful Year

import java.util.Scanner;

public class BeautifulYear {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int y=sc.nextInt();
    y++;
    sc.close();
    boolean f=false;
    do{
    f=false;
    for(int i=0;i<4;i++){
      String s=String.valueOf(y);
      for(int j=i+1;j<4;j++){
        if(s.charAt(i)==s.charAt(j)){
          f=true;
        }
      }
    }
    if(f){
      y++;
    }
  }while(f);
  System.out.println(y);
  }
}