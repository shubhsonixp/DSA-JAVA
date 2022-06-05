/*
Subarray with 0 sum
Given an array of positive and negative numbers. Find if there is a subarray (of size at-least one) with 0 sum.

Example 1:

Input:
5
4 2 -3 1 6

Output: 
Yes

Explanation: 
2, -3, 1 is the subarray 
with sum 0.
Example 2:

Input:
5
4 2 0 1 6

Output: 
Yes

Explanation: 
0 is one of the element 
in the array so there exist a 
subarray with sum 0.
Your Task:
You only need to complete the function subArrayExists() that takes array and n as parameters and returns true or false depending upon whether there is a subarray present with 0-sum or not. Printing will be taken care by the drivers code.

Expected Time Complexity: O(n).
Expected Auxiliary Space: O(n).

Constraints:
1 <= n <= 104
-105 <= a[i] <= 105
*/
import java.util.*;
public class problem40 {
    public static void main(String[] args){
        int[] a={1, 4, -2, -2, 5, -4, 3};
        int n=a.length;
        int sum=0;
        boolean flag=false;
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<n;i++){
            sum+=a[i];
            if(sum==0){
                flag=true;
            }
            if(hs.contains(sum)){
                flag=true;
            }
            else{
                hs.add(sum);
            }
        }
        System.out.println(flag==true?"yes":"no");
    }
}
/*
Explanation
arr[] = {1, 4, -2, -2, 5, -4, 3}

If we consider all prefix sums, we can
notice that there is a subarray with 0
sum when :
1) Either a prefix sum repeats or
2) Or prefix sum becomes 0.

Prefix sums for above array are:
1, 5, 3, 1, 6, 2, 5

Since prefix sum 1 repeats, we have a subarray
with 0 sum.  
*/