/*
Pattern 3
1. You are given a number n. 2. You've to create a pattern of * and separated by tab as shown in output format.


Constraints
1 <= n <= 10

Format
Input
A number n

Output
pat31

Example
Sample Input

5

Sample Output
				*
			*	*
		*	*	*
	*	*	*	*
*	*	*	*	*
*/
import java.util.*;
public class problem29 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        for(int i=1;i<=n;i++){
            for(int j=i;j<n;j++){
                System.out.print(" \t");
            }
            for(int k=0;k<i;k++){
                System.out.print("*\t");
            }
            System.out.println("");
        }
    }
}
