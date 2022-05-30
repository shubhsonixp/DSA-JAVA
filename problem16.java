/*
Save the Prisoner!
A jail has a number of prisoners and a number of treats to pass out to them. Their jailer
decides the fairest way to divide the treats is to seat the prisoners around a circular table in sequentially numbered chairs. 
A chair number will be drawn from a hat. Beginning with the prisoner in that chair, 
one candy will be handed to each prisoner sequentially around the table until all have been distributed.
The jailer is playing a little joke, though. The last piece of candy looks like all the others, but it tastes awful. 
Determine the chair number occupied by the prisoner who will receive that candy.

Example
n=4
m=6
s=2
There are 4 prisoners,6  pieces of candy and distribution starts at chair 2. The prisoners arrange themselves in seats numbered 1 to 4. 
Prisoners receive candy at positions 2,3,4,1,3 The prisoner to be warned sits in chair number 3.
*/

import java.util.*;
public class problem16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int s=sc.nextInt();
        s=s-1;
        sc.close();
        for(int i=0;i<m;i++){
            s=s+1;
            if(s>n){
                s=1;
            }
        }
        System.out.println(s); 
    }
}
//optimal code
/*
(((m-1)+(s-1))%n+1)

We start off at some random prisoner S and try to distribute M candies. 
So we could just do S + M to see which prisoner we end up at. However, 
we may have more candies than prisoners, so we loop back around to the first prisoner by doing the % N where N is number of prisoners.
Each +1 and -1 that you see in the equation is to fix the off-by-one problems that exist since prisoners 
are counted from 1 to N while modular arithmetic is counted from 0.
*/