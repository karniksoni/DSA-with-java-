import java.util.*;
public class divisibleByBoth3And5 {
    public static void main(String[] args){
        System.out.println("Enter the number:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
       
        if(num % 3== 0 && num % 5 ==0){
            System.err.println(num + " is divisible by both 3 and 5.");
        }
        else{
            System.out.println(num + " is not divisible by both 3 and 5.");
        }
    }
}
