// 160A - Twins

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Twins {
  public static void main(String[] args) throws IOException{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int n=Integer.parseInt(br.readLine());
    int[] coins=Arrays.stream(br.readLine().split("\\s")).mapToInt(Integer::parseInt).toArray();
    Integer[] ttt=Arrays.stream(coins).boxed().toArray(Integer[]::new);
    Arrays.sort(ttt,Collections.reverseOrder());
    int sumOfArray=Arrays.stream(coins).sum();
    int temp=0;
    int i;
    for(i=0;i<n;i++){
      temp+=ttt[i];
      sumOfArray-=ttt[i];
      if(temp>sumOfArray){
        break;
      }
    }
    System.out.println(i+1);
  }
}

/*
int[] num;
String[] strNums = bi.readLine().split("\\s");
for(int i=0; i<strNums.length; i++) {
  num[i] = Integer.parseInt(strNums[i]);
}
*/

/* 
int[] array = Arrays.stream(reader.readLine().split("\\s")).mapToInt(Integer::parseInt).toArray();
*/