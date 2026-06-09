public class array_example_1 {
    public static void Largestele(int[] arr){
        int temp =0;
        for(int i =0;i<arr.length;i++){
            if(arr[i] > temp){
                temp = arr[i];

            }

        }
    }
    public static void main(String[] args) {
        int[] arr = {10,20,4,45,99};
        Largestele(arr);
    }
}

