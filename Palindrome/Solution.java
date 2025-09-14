package Palindrome;

import java.util.LinkedList;

public class Solution {
    public boolean isPalindrome(String s) {
        //remove all except alphanumeric characters 
        s = s.replaceAll("[^a-zA-Z0-9^]", "");
        StringBuilder sb = new StringBuilder(s);
        sb = sb.reverse();
        String invertedString = sb.toString();
       return s.equalsIgnoreCase(invertedString);
    }
    public boolean isPalindromeStackImplementation(String string){
        String lowercaseString = string.toLowerCase();
        LinkedList<Character> stack = new LinkedList<Character>();
        StringBuilder noPunctuation = new StringBuilder();
        for(int i=0; i<lowercaseString.length(); i++){
            if(lowercaseString.charAt(i)>='a' && lowercaseString.charAt(i)<='z'){
                stack.push(lowercaseString.charAt(i));
                noPunctuation.append(lowercaseString.charAt(i));
            }
        }
        StringBuilder reverseString = new StringBuilder();
        while(!stack.isEmpty()){
            reverseString.append(stack.pop());
        }
        return noPunctuation.toString().equals(reverseString.toString());
    }
    public static void main(String args[]){
        Solution sol = new Solution();
        String s = "A man, a plan, a canal: Panama"; 
        System.out.println(sol.isPalindrome(s));
        System.out.println(sol.isPalindromeStackImplementation(s));
        if(sol.isPalindrome(s)){
            System.out.println(s + " is a valid palindrome");
        }
        else{
            System.out.println(s + " is not a valid palindrome");
        }
        
    }
}
