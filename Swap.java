
import java.util.Arrays;

public class Swap{
   
    public static void main(String args[]){
        int arr[] = {1,3,23,9,18};
        swap(arr, index1:1, index2:3);

        System.out.println(Arrays.toString(arr));
    }
    public static swap(int arr , int index1 , int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;

    }
}