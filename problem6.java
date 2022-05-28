//reverse a number
import java.util.*;
public class problem6 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        sc.close();
        int dig;
        int rev=0;
        while(num>0){
            dig=num%10;
            num=num/10;
            rev=rev*10+dig;
        }
        System.out.println(rev);
    }
}
