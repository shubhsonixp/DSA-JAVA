/*
GCD and LCM
1. You are required to print the Greatest Common Divisor (GCD) of two numbers. 

2. You are also required to print the Lowest Common Multiple (LCM) of the same numbers. 

3. Take input "num1" and "num2" as the two numbers. 

4. Print their GCD and LCM.


Constraints
2 <= n <= 10^9

Format
Input
num1
num2
.. the numbers whose GCD and LCM we have to find.

Output
a
b
.. where 'a' and 'b' are the GCD and LCM respectively.

Example
Sample Input

36
24

Sample Output
12
72
*/
import java.util.*;
public class problem20 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        sc.close();
        int lcm=num1*num2;
        int dig;
        while(num1%num2!=0){
            dig=num1%num2;
            num1=num2;
            num2=dig;

        }
        System.out.println(num2);
        System.out.println(lcm/num2);
    }
}
