//fabonacci series
import java.util.*;
public class problem3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        int first=0;
        int second=1;
        int next;
        int n1=1;
        while(n1<=n){
            System.out.println(first);
            next=first+second;
            first=second;
            second=next;
            n1++;
        }
    }
}
