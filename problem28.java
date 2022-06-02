/*
Pattern 2
1. You are given a number n.
2. You've to create a pattern of * and separated by tab as shown in output format.

Constraints
1 <= n <= 100

Format
Input
A number n

Output
pat21

Example
Sample Input

5

Sample Output
*	*	*	*	*	
*	*	*	*	
*	*	*	
*	*	
*
*/
import java.util.*;
public class problem28 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        for(int i=n;i>0;i--){
            for(int j=i;j>0;j--){
                System.out.print("*\t");
            }
            System.out.println("");
        }
        
    }
}
