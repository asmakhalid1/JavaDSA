package Factorial;

public class Solution {
    public int factorial(int num){
        if(num==0){
            return 1;
        }
        return num * factorial(num-1);
    }
    public static void main(String[] args){
        Solution sol = new Solution();
        System.out.println("Factorial of 0: " + sol.factorial(0));
        System.out.println("Factorial of 1: " + sol.factorial(1));
        System.out.println("Factorial of 5: " + sol.factorial(5));
    }
}
