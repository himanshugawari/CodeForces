import java.util.*;

public class WordCapitalization {
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String cap=sc.nextLine();
    StringBuilder str=new StringBuilder(cap);
    str.setCharAt(0, Character.toUpperCase(cap.charAt(0)));
    System.out.println(str);
    sc.close();
  }
}