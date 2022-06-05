/*
Merge Without Extra Space
Given two sorted arrays arr1[] of size N and arr2[] of size M. Each array is sorted in non-decreasing order. Merge the two arrays into one sorted array in non-decreasing order without using any extra space.


Example 1:

Input:
N = 4, M = 5
arr1[] = {1, 3, 5, 7}
arr2[] = {0, 2, 6, 8, 9}
Output: 0 1 2 3 5 6 7 8 9
Explanation: Since you can't use any 
extra space, modify the given arrays
to form 
arr1[] = {0, 1, 2, 3}
arr2[] = {5, 6, 7, 8, 9}

Example 2:

Input:
N = 2, M = 3
arr1[] = {10, 12}
arr2[] = {5, 18, 20}
Output: 5 10 12 18 20
Explanation: Since you can't use any
extra space, modify the given arrays
to form 
arr1[] = {5, 10}
arr2[] = {12, 18, 20}

Your Task:
You don't need to read input or print anything. Complete the function merge() which takes the two arrays arr1[], arr2[] and their sizes n and m, as input parameters. The function does not return anything. Use the given arrays to sort and merge arr1[] and arr2[] in-place. 
Note: The generated output will print all the elements of arr1[] followed by all the elements of arr2[].


Expected Time Complexity: O((n+m)*log(n+m))
Expected Auxiliary Space: O(1)


Constraints:
1 <= N, M <= 5*104
0 <= arr1i, arr2i <= 106
*/
import java.util.*;
public class problem35 {
    public static void main(String[] args){
        int[] arr={1,3,5,7};
        int[] arr2={0,2,6,8,9};
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            al.add(arr[i]);
        }
        for(int i=0;i<arr2.length;i++){
            al.add(arr2[i]);
        }
        Collections.sort(al);
        for(int i=0;i<arr.length;i++){
            arr[i]=al.get(i);
        }
        for(int i=0;i<arr2.length;i++){
            arr2[i]=al.get(i+arr.length);
        }
        StringBuffer str=new StringBuffer();
        for(int i=0;i<arr.length;i++){
            str.append(arr[i]+" ");
        }
        for(int i=0;i<arr2.length;i++){
            str.append(arr2[i]+" ");
        }
        System.out.println(str);
    }
}
