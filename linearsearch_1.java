public class linearSearch_1{
    public static int LinearSearch(int arr[], int key){
        for(int i =0;i<arr.length;i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] arr = {3,5,7,9,2,6,23,55};
        int key = 9;
       int result =  LinearSearch(arr , key);
       if(result!=-1){
        System.out.println("found at index " +result);
       }
       else{
        System.out.println("not found");
       }
     }
}