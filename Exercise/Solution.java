package Exercise;
// runningSum[i] = sum(nums[0]...nums[i]);
// Input: nums = [3, 1, 2, 10, 1]
// Output: [3, 4, 6, 16, 17]
public class Solution {
    public static int[] runningSum(int[] nums){
        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i] + nums[i - 1];
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {3, 1, 2, 10, 1};

        int[] answers = runningSum(nums);

        for (int i = 0; i < answers.length; i++) {
            System.out.print(answers[i] + " ");
        }
    }
}