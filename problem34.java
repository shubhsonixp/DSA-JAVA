/*
String Reverse
Problem Statement
You are having a string ‘S’ containing ASCII characters. You are required to reverse the input string.
You must do this by modifying the input string in-place with O(1) extra memory.
Output the reverse of the string ‘S’.
Example :
S = “hello”

Explanation : 

The reverse of the string ‘S’ is “olleh”.
Input Format :
The first line contains an integer 'T' which denotes the number of test cases to be run. Then the test cases follow.

The only line of each test case contains a string ‘S’.
Output Format :
For each test case, print a string denoting the reverse of the string ‘S’.

Print the output of each test case in a new line.
Note :
You don’t need to print anything. It has already been taken care of. Just implement the given function.
Constraints :
1 <= T <= 5
1 <= S.length <= 10^5

Time Limit : 1 sec
Sample Input 1 :
2
ninja
MoM
Sample Output 1 :
ajnin
MoM
Explanation Of Sample Input 1 :
For test case 1 we have, 

The reverse of “ninja” is “ajnin”.

So, we output “ajnin” ( without quotes ).

For test case 2 we have, 

The reverse of “MoM” is “MoM” as it is a palindrome.

So, we output “MoM”.
Sample Input 2 :
2
ggUM
Kzk
Sample Output 2 :
MUgg
kzK
*/
import java.util.*;
public class problem34 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String[] arr=new String[n];
        StringBuffer sb = new StringBuffer();
        for(int i=0;i<n;i++){
            arr[i]=sc.nextLine();
        }
        for(int i=n-1;i>=0;i--){
            sb.append(arr[i]);
        }
        String str = sb.toString();
        System.out.println(str);
        sc.close();
    }
}
