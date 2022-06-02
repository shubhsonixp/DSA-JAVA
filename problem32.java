/*
Pattern 5
1. You are given a number n.
2. You've to create a pattern of * and separated by tab as shown in output format.

Constraints
1 <= n <= 100
 Also, n is odd.

Format
Input
A number n

Output
pat51

Example
Sample Input

5

Sample Output
		*	
	*	*	*	
*	*	*	*	*	
	*	*	*	
		*	
*/
import java.util.*;
public class problem32 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int space=n/2;
        int stars=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=space;j++){
                System.out.print("\t");
            }
            for(int j=1;j<=stars;j++){
                System.out.print("*\t");
            }
            if(i<=n/2){
                space--;
                stars+=2;
            }
            else{
                space++;
                stars-=2;
            }
            System.out.println();
        }
        sc.close();
    }    
}
/*
Explanation
1. Problem Discussion:
You have been given a number n. You have to create a pattern of * and separated by tab. In this question, you have to create something like a diamond. Let’s say n is given as 5. So, the pattern will be as follows:

https://nados.io/article/pattern-5?zen=true


2. Approach:
As you can notice from the figure given above, for the first half, the number of stars is increasing by 2 in each row, and the number of spaces is decreasing by 1. In the second half of the pattern, i.e., after the middle row, the number of stars is decreasing by 2, and the number of spaces is increasing by 1. So, for n=5, the pattern will go in the following manner.

https://nados.io/article/pattern-5?zen=true


Also, notice that the initial value of stars is 1, while the initial value of spaces is the integer value of half of the value n given to us, i.e., in this case, 2. Let’s try to implement this with the help of numbers first. Here’s the code:
*/