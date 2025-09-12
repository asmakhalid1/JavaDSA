package InsertionSort;
import java.util.*;
public class Solution {
    public void insersionSort(int[] nums){
        if(nums==null||nums.length==0){
            return;
        }
        //think two partitions, the left partition is the first element and is already sorted
        int sortedPartitionLength = 1;
        int unsortedPartitionLength = nums.length-sortedPartitionLength;
        //tke the first element of the unsorted partition and put it in the right place in the sorted partition
        while(sortedPartitionLength!=nums.length){
            int temp = nums[sortedPartitionLength];
            for(int i=sortedPartitionLength-1; i<sortedPartitionLength;i--){
                if(nums[i]>temp){
                    //move nums[i] to the right
                    nums[i+1] = nums[i];
                }else{
                    nums[i+1] = temp;
                    break;
                }
                
            }
            sortedPartitionLength++;
        }

    }
    public static void main(String[] args){
        Solution sol = new Solution();
        int[] array = new int[]{-22, 0, 8, -7, 56, 34, 78, 21, 4};
        System.out.println("Insertion Sort");
        System.out.println("Unsorted array: " + Arrays.toString(array));
        sol.insersionSort(array);
        System.out.println("Sorted array: " + Arrays.toString(array));
    }
}
