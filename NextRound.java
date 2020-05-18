import java .util.Scanner;

public class NextRound {
 public static void main(String[] args){
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   int k=sc.nextInt();
   int counter=0;
   int i=0;
   int[] array=new int[n];
   while(n--!=0){
     array[i++]=sc.nextInt();
   }
   int p=array[k-1];
   for(Integer a:array){
     if(a>0 & a>=p){
       counter++;
     }
   }
   System.out.println(counter);
   sc.close();
 }
}