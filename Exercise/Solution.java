package Exercise;
// int maximumWealth(int[][] accounts)
// Input: accounts = [ [7, 1, 3], [2, 8, 7], [1, 9, 5] ]
// Output: 17

public class Solution {
    public static int maximumWealth(int[][] accounts){
        int maxWealthSoFar = 0;

        for (int[] customer : accounts) {
            int currentCustomerWealth = 0;

            for (int bank : customer) {
                currentCustomerWealth += bank;
            }

            maxWealthSoFar = Math.max(maxWealthSoFar, currentCustomerWealth);
        }

        return maxWealthSoFar;        
    }

    public static void main(String[] args) {
        int[][] accounts = {
            {7, 1, 3},
            {2, 8, 7},
            {1, 9, 5}
        };

        int maxWealth = maximumWealth(accounts);
        System.out.println("Maximum wealth: " + maxWealth);
    }
}