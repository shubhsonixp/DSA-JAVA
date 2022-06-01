/*
Pythagorean Triplets
1. You are required to check if a given set of numbers is a valid pythagorean triplet.
2. Take as input three numbers a, b and c.
3. Print true if they can form a pythagorean triplet and false otherwise.

Constraints
1 <= a <= 10^9
1 <= b <= 10^9
1 <= c <= 10^9

Format
Input
a, an integer
b, an integer
c, an integer

Output
true if the numbers form a pythagorean triplet and false otherwise

Example
Sample Input

5 3 4

Sample Output
true
*/
import java.util.*;
public class problem25 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        sc.close();
        int max=Math.max(a,b);
        max=Math.max(c, max);
        int case1=a*a+b*b;
        int case2=a*a+c*c;
        int case3=b*b+c*c;
        int Max=max*max;
        if(case1==Max|| case2==Max || case3==Max){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
