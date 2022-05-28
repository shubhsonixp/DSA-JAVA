//reverse an array
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
    }
}