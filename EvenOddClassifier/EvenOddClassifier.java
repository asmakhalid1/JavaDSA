package EvenOddClassifier;

import java.util.*;

public class EvenOddClassifier {
    public static Map<String, List<Integer>> classifyNumbers(int[] nums) {
        // Your code here
        List<Integer> evenNums = new ArrayList<>();
        List<Integer> oddNums = new ArrayList<>();
        for (int num : nums) {
            if(num % 2 == 0){
                evenNums.add(num);
            }
            else{
                oddNums.add(num);
            }
        }
        Map<String, List<Integer>> classifier = new HashMap<>();
        classifier.put("Even", evenNums);
        classifier.put("Odd", oddNums);

        return classifier;
    }

    public static void main(String[] args) {
        // Write 3 test cases here
        int[] arr = new int[]{1,2,3,4,5};
        EvenOddClassifier myClassifier = new EvenOddClassifier();
        Map<String, List<Integer>> classifierMap =  myClassifier.classifyNumbers(arr);
        System.out.println("Even numbers: " + classifierMap.get("Even"));
        System.out.println("Odd numbers: " + classifierMap.get("Odd"));
    }
}