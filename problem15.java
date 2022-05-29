/*
Viral Advertising

HackerLand Enterprise is adopting a new viral advertising strategy. 
When they launch a new product, they advertise it to exactly 5 people on social media.
On the first day, half of those 5 people (i.e.,floor ) like the advertisement and each shares it with  3 of their friends. 
At the beginning of the second day,  people receive the advertisement.
Each day,  of the recipients like the advertisement and will share it with  friends on the following day. 
Assuming nobody receives the advertisement twice, determine how many people have liked the ad by the end of a given day, 
beginning with launch day as day .

Example
n=5
Day Shared Liked Cumulative

1      5     2       2

2      6     3       5

3      9     4       9

4     12     6      15

5     18     9      24
The progression is shown above. The cumulative number of likes on the 5th day is 24.

Sample Input
3
Sample Output
9
*/
import java.util.*;
public class problem15 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        int s=5;
        int l=0;
        for(int i=0;i<n;i++){
            int m;
            m=Math.abs(s/2);
            s=m*3;
            l=l+m;
        }
        System.out.println(l);
    }
}
