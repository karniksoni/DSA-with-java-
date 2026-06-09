




public class array {
    public static void MaxSubArray(int numbers[]){
        // this is the better approach than brute forces
        // here we are using prefic Sum approach to make the better time com.sun.org.apache.xerces.internal.impl.xs.identity
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        
        int prefix[] = new int[numbers.length];
        prefix[0] = numbers[0];
        //calculate prefix
        for(int i =1;i<prefix.length;i++){
            prefix[i] = prefix[i-1] + numbers[i];      
        
        }
        for(int i =0;i<numbers.length;i++){
            int start =i;
            for(int j =i;j<numbers.length;j++){
                int end = j;
                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];

                if(maxSum < currSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println("max sum = " + maxSum);


    }
    public static void MaxsubArray(int numbers[]){
        // this is a brute force approach to find the maximum subarray
        int currSum =0;
        int maxSum = Integer.MIN_VALUE;

        for(int i =0;i<numbers.length;i++){
            int start = i;
            for(int j = i;j<numbers.length;j++){
                int end = j;
                currSum = 0;
                for(int k = start;k<= end;k++){
                    currSum += numbers[k];
                    System.out.println(currSum);
                }
                if(maxSum < currSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println("max sum = "+ maxSum);

    }

    public static void SubArray(int numbers[]){
        //subarray ka code h ye 
        for(int i =0;i<numbers.length;i++){
            int start = i;
            for(int j = i; j<numbers.length;j++){
                int end = j;
                for(int k = start; k<=end ; k++){
                    System.out.print(numbers[k] +  "  ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    public static void pairsinArray(int numbers[]){
        //pairs in array ka code h ye 
        for(int i =0;i<numbers.length;i++){
            int curr = i;
            for(int j = i+1;j<numbers.length;j++){
                System.out.print("(" + curr +"," + numbers[j] + ")");
            }
            System.out.println();
        }
    }
    public static void reverse(int numbers[]){
        // reversing the array 
        int first = 0;
        int last = numbers.length-1;
        while(first < last){
            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;
        }
    }
    public static void main(String[] args){
        int numbers[] = {1,-2,6,-1,3};
        MaxSubArray(numbers);
    }
}
