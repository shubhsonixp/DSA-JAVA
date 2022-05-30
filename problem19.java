//Rotate a number
/*
1. You are given two numbers n and k. You are required to rotate n, k times to the right. If k is positive, rotate to the right i.e. remove rightmost digit and make it leftmost. Do the reverse for negative value of k. Also k can have an absolute value larger than number of digits in n.
2. Take as input n and k.
3. Print the rotated number.
4. Note - Assume that the number of rotations will not cause leading 0's in the result. e.g. such an input will not be given
   n = 12340056
   k = 3
   r = 05612340

Constraints
1 <= n < 10^9
-10^9 < k < 10^9

Format
Input
"n" where n is any integer.
"K" where k is any integer.

Output
"r", the rotated number

Example
Sample Input

562984
2

Sample Output
845629
*/
import java.util.*;
public class problem19 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int k=sc.nextInt();
        sc.close();
        int length = (int)(Math.log10(num)+1);
        k=k%length;
        if(k<0){
            k=k+length;
        }
        int d=(int)Math.pow(10, k);
        int m=(int)Math.pow(10, length-k);
        int dig;
        dig=num%d;
        num=num/d;
        num=num+dig*m;
        System.out.println(num);
    }
}
