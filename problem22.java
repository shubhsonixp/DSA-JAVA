/*
Find similarities between two arrays.
Problem Statement
You have been given two arrays/list ‘ARR1’ and ‘ARR2’ consisting of ‘N’ and ‘M’ integers respectively. Your task is to return the number of elements common to ‘ARR1’ and ‘ARR2’ and the number of elements in the union of ‘ARR1’ and ‘ARR2’.
Example:
Let’s assume ‘ARR1’ is [1,2,3,4,5] and ‘ARR2’ is [2,4,6,8]. Elements common to ‘ARR1’ and ‘ARR2’ are [2,4] as they occur in both ‘ARR1’ and ‘ARR2’. Therefore the number of elements common to ‘ARR1’ and ‘ARR2’ is 2. Union of ‘ARR1’ and ‘ARR2’ is [1,2,3,4,5,6,8]. Therefore the number of distinct elements in the union of ‘ARR1’ and ‘ARR2’ is 7. So, the answer will be 2 7.
Note:
1. ‘ARR1’ consists of distinct integers i.e no number occurs twice in array/list.

2. ‘ARR2’ consists of distinct integers i.e no number occurs twice in array/list.
Input Format:
The first line contains a single integer ‘T’ representing the number of test cases.

The first line of each test case contains two single space-separated integers ‘N' and ‘M’ representing the size of the array/list ‘ARR1’ and ‘ARR2’ respectively.

The second line of input of each test case contains ‘N’ single space-separated integers representing the array/list elements of ‘ARR1’.

The third line and the last line of input of each test contains ‘M’ single space-separated integers representing the array/list elements of ‘ARR2’.
Output Format:
For each test case, return the number of elements common to ‘ARR1’ and ‘ARR2’ and the number of distinct elements in the union of ‘ARR1’ and ‘ARR2’. 
Note:
You do not need to print anything; it has already been taken care of. Just implement the function.
Constraints:
1 <= T <= 10
1 <= N <= 1000
1 <= M <= 1000
1 <= ‘arr1[i]’ <= 10^5
1 <= ‘arr2[i]’ <= 10^5  

Time Limit: 1sec
Sample Input 1:
2
2 2
1 2
3 4  
2 1
2 3
3
Sample Output 1:
0 4
1 2
*/
import java.util.*;
public class problem22 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int[] arr=new int[n1];
        int[] arr1=new int[n2];
        int sim=0;
        for(int i=0;i<n1;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n2;i++){
            arr1[i]=sc.nextInt();
        }
        sc.close();
        for(int i=0;i<n1;i++){
            for(int j=0;j<n2;j++){
                if(arr[i]==arr1[j]){
                    sim++;
                }
            }
        }
        int[] c1=new int[n1+n2];
        System.arraycopy(arr, 0, c1, 0, n1);
        System.arraycopy(arr1, 0, c1, n1, n2);
        LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
        for (int i = 0; i < n1+n2; i++){
            set.add(c1[i]);
        }
        System.out.print(sim+" ");
        System.out.print(set.size());
    }    
}

/*
optimal code
ArrayList result = new ArrayList();
int sum = arr1.size() + arr2.size();
arr1.addAll(arr2);
HashSet set = new HashSet(arr1);
int unionSize = set.size();  
result.add(sum-unionSize);
result.add(unionSize);
return result;
*/