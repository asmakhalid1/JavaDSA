package MultiplesOf10;

public class Solution {
    private void printMultiplesOf10(){
        for(int i=1;i<=1000; i++){
            if(i % 10 == 0){
                System.out.print(i + " ");
            }
        }
    }
    public static void main(String args[]){
        Solution sol = new Solution();
        sol.printMultiplesOf10();
    }
}
