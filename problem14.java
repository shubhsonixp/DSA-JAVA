/*
Beautiful Days at the Movies

Lily likes to play games with integers. She has created a new game where she determines the difference between a number and its reverse. 
For instance, given the number 12, its reverse is 21. Their difference is 9.
The number120  reversed is 12 , and their difference is 99 .She decides to apply her game to decision making. 
She will look at a numbered range of days and will only go to a movie on a beautiful day.

Test Case-
Sample Input
20 23 6

Sample Output
2

*/
import java.util.*;
public class problem14 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int k=sc.nextInt();
        sc.close();
        int count=0;
        for(int i=n1;i<=n2;i++){
            StringBuilder temp = new StringBuilder();
            temp.append(i);
            temp=temp.reverse();
            String temp1 = temp.toString();
            int aRev = Integer.parseInt(temp1);
            if((i-aRev)%k==0){
                count++;
            }
        }
        System.out.println(count);
    }
}
