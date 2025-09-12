package ShellSort;

import java.util.Arrays;

public class Solution {
    public void shellSort(int[] nums){
        
        if(nums==null||nums.length==0){
            return;
        }
        for(int gap=nums.length/2; gap>0;gap/=2){
            for(int i=gap; i<nums.length;i++){
                int temp = nums[i];
                int j=i;
                while(j>=gap && nums[j-gap]>temp){
                    nums[j] = nums[j-gap];
                    j=j-gap;
                }
                nums[j] = temp;
            }
        }

    }
    public static void main(String[] args){
        Solution sol = new Solution();
        int[] array = new int[]{-22, 0, 8, -7, 56, 34, 78, 21, 4};
        System.out.println("Shell Sort");
        System.out.println("Unsorted array: " + Arrays.toString(array));
        sol.shellSort(array);
        System.out.println("Sorted array: " + Arrays.toString(array));
    }
}
