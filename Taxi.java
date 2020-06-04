// 158B - Taxi

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Taxi {
  public static void main(String[] args) throws IOException{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    Long.parseLong(br.readLine());
    int[] arr=Arrays.stream(br.readLine().split("\\s")).mapToInt(Integer::parseInt).toArray();
    br.close();
    Arrays.sort(arr);
    int taxi=0;
    int i=arr.length-1;
        int k=0;
        while(k!= i){
            if(arr[i]+ arr[k]<=4){
                arr[i]+=arr[k];
                k++;
            }
            else{
                i--;
                taxi++;
            }
        }
    System.out.println(taxi+1);
  }
}