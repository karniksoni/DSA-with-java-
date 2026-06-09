// [2,7,11,15]   target = 9
// output = [0,1] 

import java.util.*;
public class java {
    public static int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        for(int i =0;i<n;i++){
            for(int j =i+1;j<n;j++){
                if(nums[i] + nums[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int[] nums = {3,2,4};
        int target = 6;
        int[] result = twoSum(nums,target);
        System.out.println(Arrays.toString(result));
    }
}
