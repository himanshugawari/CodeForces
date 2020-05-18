import java.util.Scanner;

public class WayTooLongWords {
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t--!=0){
      String s=new String(sc.next());
      if(s.length()<=10){
        System.out.println(s);
      }else{
        StringBuffer sb=new StringBuffer();
        sb.append(s.charAt(0)).append(s.length()-2).append(s.charAt(s.length()-1));
        System.out.println(sb.toString());
      }
    }
    sc.close();
  }
}