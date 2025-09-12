package SelectionSort;
import java.util.*;

public class Solution {
    public void selectionSort(int[] nums){
        int last_index = nums.length - 1;
        while (last_index!=0) {
            int max_index = last_index;
            for(int i=0; i<last_index;i++){
                if(nums[i]>nums[max_index]){
                    max_index = i;
                }
            }
            if(max_index!=last_index){
                swap(nums, max_index, last_index);
            }
            last_index--;
        }
        
    }
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public static void main(String[] args){
        int[] numArray = new int[]{22, 56, -7, 0, 8, 76};
        Solution sol = new Solution();
        System.out.println("Selection Sort");
        System.out.println("Unsorted array: " + Arrays.toString(numArray));
        sol.selectionSort(numArray);
        System.out.println("Sorted array: " + Arrays.toString(numArray));
    }
}
