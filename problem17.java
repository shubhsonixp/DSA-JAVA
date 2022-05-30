/*
Circular Array Rotation
John Watson knows of an operation called a right circular rotation on an array of integers. 
One rotation operation moves the last array element to the first position and shifts all remaining elements right one. 
To test Sherlock's abilities, Watson provides Sherlock with an array of integers. Sherlock is to perform the rotation operati
on a number of times then determine the value of the element at a given position.
For each array, perform a number of right circular rotations and return the values of the elements at the given indices.
Sample Input 0
3 2 3
1 2 3
0
1
2
Sample Output 0
2
3
1
*/
import java.util.*;
public class problem17 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r=sc.nextInt();
        int q=sc.nextInt();
        int[] arr=new int[n];
        int[] que=new int[q];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<q;i++){
            que[i]=sc.nextInt();
        }
        sc.close();
        int temp;
        for(int i=0;i<r;i++){
            temp=arr[n-1];
            for(int j=n-1;j>0;j--){
                arr[j]=arr[j-1];
            }
            arr[0]=temp;
        }
        for(int i=0;i<q;i++){
            System.out.println(arr[i]);
        }
    }
}
/*
optimal code

int n=a.size();//size of array
    k=k%n;//finding the number of rotation left after the point if rotation at which the array will become same.
    int q=queries.size();//size of queries array
    for(int i=0;i<q;i++){
        int pos=((queries.get(i)-k+n)%n);//finding the index of original array at which the element is present which is present at rotated array at q[i] position.
        //we are subtracting no. of rotations from the given quereies from this we will get the position of element at original array and sometimes position can also come in
        negative so we are adding the postion with n and modulous the position with n from this we will get the postion . 
        queries.set(i, a.get(pos));
    }
*/