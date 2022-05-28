//printing indiviual digit of a number
import java.util.*;
public class problem5 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        sc.close();
        int count=0;
        int temp=num;
        while(num>0){
            num=num/10;
            count++;
        }
        int div=(int)Math.pow(10, count-1);
        while(div>0){
            int q=temp/div;
            System.out.println(q);
            temp=temp%div;
            div=div/10;
        }
    }
}
