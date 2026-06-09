public class BinarySearch {
    public static int Binarysearch(int[] arr , int target){
        int low = 0;
        int high = arr.length -1;

        while(low <= high){
            int mid = low + (high - low)/2;

            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] < target ){
                low = mid + 1;
            
            }
            else {
                high = mid - 1;
            }
        }
        return -1; // if the element is not exist in the given array
    }
    
    public static void main(String[] args){
        int[] arr = {2,5,7,10,15,20,25,30};
        int target = 100;
        int index = Binarysearch(arr, target);
        if(index == -1){
            System.out.println("Not found");
        }else{
            System.out.println("key is found at "+ index);
        }
    }
}
