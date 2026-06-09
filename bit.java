import java.util.Scanner;

public class bit {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int word = sc.nextInt();
        int generate = sc.nextInt();
        System.out.println(word & generate);
    }
}
