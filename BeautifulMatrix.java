import java.util.*;
public class BeautifulMatrix {
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int x=0,y=0;
    for(int i=0;i<5;i++){
      for(int j=0;j<5;j++){
        int temp=sc.nextInt();
        if(temp==1){
          x=i;y=j;
          break;
        }
      }
    }
    System.out.println(Math.abs(2-x)+Math.abs(2-y));
    sc.close();
  }
}