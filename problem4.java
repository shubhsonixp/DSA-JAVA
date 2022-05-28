//counting digit of a number
import java.util.*;
public class problem4 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        long num=sc.nextLong();
        sc.close();
        int count=0;
        while(num>0){
            num=num/10;
            count++;
        }
        System.out.println(count);

    }
}
