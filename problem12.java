/*
time conversion
Given a time in 12-hour AM/PM format, convert it to military (24-hour) time.
Note: - 12:00:00AM on a 12-hour clock is 00:00:00 on a 24-hour clock.
- 12:00:00PM on a 12-hour clock is 12:00:00 on a 24-hour clock.

Test Case
Sample Input 
07:05:45PM
Sample Output 
19:05:45
*/
import java.util.*;
public class problem12 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        sc.close();
        String listtime[]=str.split(":");
        String h=listtime[0];
        String m=listtime[1];
        String s=listtime[2].substring(0,2);
        String c=listtime[2].substring(2,4);
        if(c.equals("AM")){
            if(h.equals("12")){
                h="00";
            }
            System.out.println(h+":"+m+":"+s);
        }
        else{
            if(!h.equals("12")){
                int h1=Integer.parseInt(h);
                h1=h1+12;
                h=String.valueOf(h1);
            }
            System.out.println(h+":"+m+":"+s);
        }
    }
}
