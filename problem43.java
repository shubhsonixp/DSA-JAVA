/*
Find the median

Given an array arr[] of N integers, calculate the median
 

Example 1:

Input: N = 5
arr[] = 90 100 78 89 67
Output: 89
Explanation: After sorting the array 
middle element is the median 

Example 2:

Input: N = 4
arr[] = 56 67 30 79
Output: 61
Explanation: In case of even number of 
elements, average of two middle elements 
is the median.

 

Your Task:
You don't need to read or print anything. Your task is to complete the function find_median() which takes the array as input parameter and returns the floor value of the median.
 

Expected Time Complexity: O(n * log(n))
Expected Space Complexity: O(1)
 

Constraints:
1 <= Length of Array <= 100
1 <= Elements of Array <= 100
*/
import java.util.*;
public class problem43 {
    public static void main(String[] args){
        int[] v={90,100,78,89,67};
        int n=v.length;
        int a;
        int median=0;
        Arrays.sort(v);
        if(v.length%2==0){
            a=n/2;
            median=(v[a-1]+v[a])/2;
        }
        else{
            a=(n-1)/2;
            median=v[a];
        }
        System.out.println(median);
    }
}
