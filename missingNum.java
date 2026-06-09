public class missingNum {
    public static int missing(int[] arr, int n){
        int total = n * (n+1)/2;
        int sum = 0;
        for(int num : arr){
            sum+=num;
        }
        return total - sum;
    }
    public static void main(String[] args){
        int[] arr ={1,2,3,5};
        // int n = 5;
        int missingNumber = missing(arr,5);
        System.out.println("The missing number is: " + missingNumber);
    }

}
