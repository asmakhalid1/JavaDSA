package SortArrays;

import java.util.Arrays;

public class Solution {
    public int[] reverseSort(int[] A){
        Arrays.sort(A);
        int start = 0;
        int end = A.length-1;
        
        while(start<end){
            int temp;
            temp = A[start];
            A[start] = A[end];
            A[end] = temp;
            start++;
            end--; 

        }
        return A;
    }
    

    public static void main(String[] args){
            Solution sol = new Solution();
            int[] arr = new int[] {46,56,37,86,55,98,0,3,44};
            System.out.println("Original array: " + Arrays.toString(arr));
            sol.reverseSort(arr);
            System.out.println("Reversely sorted array: " + Arrays.toString(arr));
    }
}