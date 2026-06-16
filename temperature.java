import java.util.*;
public class temperature {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the temperature in celsius:");
        int temp = sc.nextInt();
        if(temp >= 30){
            System.out.println("hot water");
        }
        else if(temp >= 20 && temp <30){
            System.out.println("warm water");
        }
        else if(temp >= 10 && temp < 20){
            System.out.println("normal water");
        }

    }
}
