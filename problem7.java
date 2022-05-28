//reverse an array
/* test case
Test Case Input
2
6 3
1 2 3 4 5 6
5 2
10 9 8 7 6
Desired Output
1 2 3 4 6 5 
10 9 8 6 7 
*/

import java.util.*;
public class problem7{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        for(int k=0;k<r;k++){
            int n=sc.nextInt();
            int n2=sc.nextInt();
            int[] arr=new int[n];
            int[] arr2=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            int j=n-1;
            for(int i=0;i<=n2;i++){
                arr2[i]=arr[i];
            }
            for(int i=n2+1;i<n;i++){
                arr2[i]=arr[j];
                j--;
            }
            System.out.println(Arrays.toString(arr2));
        }
        sc.close();
    }
}

/*
optimal code solution
 public static void reverseArray(ArrayList<Integer> arr, int m)
    {
        // Write your code here.
       int value=arr.size()-1;
       int j=m+1;
       while(j<value+1){
           int temp=arr.get(j);
               arr.set(j,arr.get(value));
               arr.set(value,temp);
               value--;
               j++;
       }
*/       