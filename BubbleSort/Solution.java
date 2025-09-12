package BubbleSort;
import java.util.*;
public class Solution {
    public int[]  bubbleSort(int[] nums){
        int unsortedPartitionLength = nums.length;
        if (nums == null || nums.length <=1) {
            return nums;
        }
        while(unsortedPartitionLength!=0){
            for(int i=0; i< unsortedPartitionLength-1; i++){
                if (nums[i]> nums[i+1]){
                    swap(nums, i);
                }
            }
            unsortedPartitionLength--;
        }
        return nums;
    }
    private void swap(int[] nums, int i) {
        int temp = nums[i];
        nums[i] = nums[i+1];
        nums[i+1] = temp;
    }
    public static void main(String[] args){
        int[] numArray = new int[]{22, 56, -7, 0, 8, 76};
        Solution sol = new Solution();
        System.out.println("Unsorted array: " + Arrays.toString(numArray));
        sol.bubbleSort(numArray);
        System.out.println("Sorted array: " + Arrays.toString(numArray));
    }
}
