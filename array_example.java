public class array_example {
    public static int LinearSearch(int[] arr , int key){
        for(int i=0;i<arr.length;i++){
            if(key == arr[i]){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] ={2, 45, 34,65 ,60 , 99};
        int key = 100;
        int index = LinearSearch(arr, key);
        if(index == -1){
            System.out.println("not found");
        }
        else{
            System.out.println("key is found at " + index);
        }
        

    }
}

