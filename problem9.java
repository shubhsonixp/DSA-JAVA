//Kth Smallest and Largest Element of Array
/*
Sample Input 1:
2
4 4
5 6 7 2
4 3
1 2 5 4
Sample Output 1:
7 2 
4 2
*/
import java.util.*;
public class problem9 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int n2=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        sc.close();
        /*
        int t;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i] > arr[j]) {    
                    t = arr[i];    
                    arr[i] = arr[j];    
                    arr[j] = t;
            }
        }
    }   
        int[] arr2=new int[n];
        int j=n-1;
        for(int k=0;k<n;k++){
            arr2[k]=arr[j];
            j--;
        }*/
        //optimal code
        Arrays.sort(arr);
        System.out.print(arr[n2-1]+" ");
        System.out.print(arr[n-n2]);
}
}

// optimal code
