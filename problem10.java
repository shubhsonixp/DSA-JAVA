//sort 021
/*
Test Case Input
6
0 1 2 2 1 0
Desired Output
0 0 1 1 2 2  
*/
import java.util.*;
public class problem10 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        sc.close();
        //optimal code
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
// Alternative way
 //int t;
        /*
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
               if(arr[i]>=arr[j]){
                   t=arr[i];
                   arr[i]=arr[j];
                   arr[j]=t;
               }  
            }
        }*/