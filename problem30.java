/*
Pattern 4
1. You are given a number n. 2. You've to create a pattern of * and separated by tab as shown in output format.


Constraints
1 <= n <= 100

Format
Input
A number n

Output
pat41

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
public class problem30 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        int stars=5;
        int space=0;
        for(int i=0;i<n;i++){
            for(int j=1;j<=space;j++){
                System.out.print("\t");
            }
            for(int j=1;j<=stars;j++){
                System.out.print("*\t");
            }
            stars--;
            space++;
            System.out.println(); 
        }
    }
}
