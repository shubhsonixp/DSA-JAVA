/*
birthdayCakeCandles 
You are in charge of the cake for a child's birthday. You have decided the cake will have one candle for each year of their total age. 
They will only be able to blow out the tallest of the candles. Count how many candles are tallest.

Test Case-
Sample Input 0
4
3 2 1 3
Sample Output 0
2
*/
import java.util.*;
public class problem11 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        sc.close();
        Arrays.sort(arr);
        int max=arr[n-1];
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]==max){
                count++;
            }
            else{
                continue;
            }
        }
        System.out.print(count);
    }
}
/*
optimal approach
int n = in.nextInt();
        int tallest = 0;
        int frequency = 0;
        
        
        for(int i=0; i < n; i++){
            int height = in.nextInt();
            
            if(height > tallest){
                tallest = height;
                frequency = 1;
            }
            else if(height == tallest) frequency++;
        }
        System.out.println(frequency);
*/        