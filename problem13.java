/*
Angry Professor

A Discrete Mathematics professor has a class of students. Frustrated with their lack of discipline, 
the professor decides to cancel class if fewer than some number of students are present when class starts. 
Arrival times go from on time () to arrived late ().Given the arrival time of each student and a threshhold number of attendees, 
determine if the class is cancelled.

Test Case-
Sample Input
2
4 3
-1 -3 4 2
4 2
0 -1 2 1
Sample Output
YES
NO
*/
import java.util.*;
public class problem13 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] arr=new int[n];
        int attendees=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            if(arr[i]<=0){
                attendees++;
            }
        }
        sc.close();
        if(attendees>=k){
            System.out.println("No");
        }
        else{
            System.out.println("Yes");
        }
    }
}
