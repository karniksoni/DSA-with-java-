import java.util.*;
public class largerOne {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1 = sc.nextInt();
        System.out.println("enter the second number:");
        int num2 = sc.nextInt();
        if(num1 < num2){
            System.out.println(num2 +"is the larger number");
        }
        else{
            System.out.println(num1 + "is the larger number");
        }

    }
}
