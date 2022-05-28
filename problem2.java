//prime numbers till n
import java.util.*;
public class problem2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();
        int h=sc.nextInt();
        sc.close();
        for(int i=l;i<=h;i++){
            boolean flag=true;
            for(int j=2;j<=Math.sqrt(i);j++){
                if(i%j==0){
                    flag=false;
                    break;
                }
                else{
                    continue;
                }
            }
            if(flag){
                System.out.println(i);
            }
        }
    }
}
