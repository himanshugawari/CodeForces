// 41A - Translation
import java.util.*;

public class Translation {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    StringBuffer s=new StringBuffer(sc.next());
    StringBuffer t=new StringBuffer(sc.next());
    StringBuffer r=s.reverse();
    int res=r.compareTo(t);
    if(res==0){
      System.out.println("YES");
    }else{
      System.out.println("NO");
    }
    sc.close();
  }
}