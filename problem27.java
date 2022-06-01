/*
Pattern 1
1. You are given a number n.
2. You've to create a pattern of * and separated by tab as shown in output format.

Constraints
1 <= n <= 100

Format
Input
A number n

Output
pat11

Example
Sample Input

2

Sample Output
*	
*	*
*/
import java.util.*;
public class problem27 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        scn.close();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*\t");
            }
            System.out.println("");
        }
    }
}
