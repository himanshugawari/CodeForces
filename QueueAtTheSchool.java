import java.util.*;

public class QueueAtTheSchool {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int t=sc.nextInt();
    StringBuffer s=new StringBuffer(sc.next());
    while(t-->0){
      for(int i=0;i<n-1;i++){
        if(s.charAt(i)=='B' && s.charAt(i+1)=='G'){
          s.replace(i, i+1, "G");
          s.replace(i+1, i+2, "B");
          i++;
        }
      }
    }
    System.out.println(new String(s));
    sc.close();
  }
}