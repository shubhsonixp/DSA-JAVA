//prime number
import java.util.*;
class problem1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        sc.close();
        boolean flag=false;
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0){
                flag=true;
                break;
            }
            else{
                continue;
            }
        }
        if(flag){
            System.out.println("not prime");
        }
        else{
            System.out.println("Prime");
        }
    }
}