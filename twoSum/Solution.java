package twoSum;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        //Create a HashMap to store numbers and their indices
        //In HashMap we are storing numbers as keys and their indices as values because
        //if the key is what meets our search criteria, then we need to retrieve it's index
        Map<Integer, Integer> numMap = new HashMap<>();
        //Iterate through the loop
        for(int i=0; i<nums.length; i++){
            int currentNum = nums[i];
            int complement = target - currentNum;
            //if numMap contains the complement return the index of complement and current number 
            //otherwise put the current number in the numMap 
            if(numMap.containsKey(complement)){
                return new int[]{numMap.get(complement), i};
            }
            else{
                numMap.put(currentNum, i);
            }
        }
        return new int[]{};
    }
    public static void main(String[] args){
        Solution sol = new Solution();
        int[] nums = {12346};
        int[] indices = sol.twoSum(nums, 9);
        System.out.println(indices[0]+','+indices[1]);
    }
}
