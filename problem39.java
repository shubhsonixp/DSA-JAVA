/*
Common elements

Given three arrays sorted in increasing order. Find the elements that are common in all three arrays.
Note: can you take care of the duplicates without using any additional Data Structure?

Example 1:

Input:
n1 = 6; A = {1, 5, 10, 20, 40, 80}
n2 = 5; B = {6, 7, 20, 80, 100}
n3 = 8; C = {3, 4, 15, 20, 30, 70, 80, 120}
Output: 20 80
Explanation: 20 and 80 are the only
common elements in A, B and C.
 

Your Task:  
You don't need to read input or print anything. Your task is to complete the function commonElements() which take the 3 arrays A[], B[], C[] and their respective sizes n1, n2 and n3 as inputs and returns an array containing the common element present in all the 3 arrays in sorted order. 
If there are no such elements return an empty array. In this case the output will be printed as -1.

 

Expected Time Complexity: O(n1 + n2 + n3)
Expected Auxiliary Space: O(n1 + n2 + n3)
*/
import java.util.*;
public class problem39 {
    public static void main(String[] args){
        int[] A={1, 5, 10, 20, 40, 80};
        int[] B={6, 7, 20, 80, 100};
        int[] C={3, 4, 15, 20, 30, 70, 80, 120};
        int n1=A.length;
        int n2=B.length;
        int n3=C.length;
        int i=0;
        int k=0;
        int j=0;
        ArrayList<Integer> l=new ArrayList<Integer>();
        while(i<n1&&j<n2&&k<n3){
            if(A[i]==B[j]&&A[i]==C[k]&&(!l.contains(A[i]))){
                l.add(A[i]);
                i++;
                j++;
                k++;
            }
            else{
                if(A[i]<B[j]){
                    i++;
                }
                else if(B[j]<C[k]){
                    j++;
                }
                else{
                    k++;
                }
            }
        }
        System.out.println(l);
    }
}
