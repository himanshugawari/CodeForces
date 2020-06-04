// 467A - George and Accommodation

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class GeorgeAndAccommodation {
  public static void main(String[] args) throws IOException{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int n=Integer.parseInt(br.readLine());
    int[][] arr=new int[n][2];
    int count=0;
    for(int i = 0; i < n; i++) {
      int[] temp=Arrays.stream(br.readLine().split("\\s")).mapToInt(Integer::parseInt).toArray();
      for(int j = 0; j < 2; j++) {
        arr[i][j] = temp[j];
      }
    }
    br.close();
    for(int i=0;i<n;i++){
      if(arr[i][1]-arr[i][0]>=2){
        count++;
      }
    }
    System.out.println(count);
  }
} 
      
  