// Link: https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
// Given the array nums, for each nums[i] find out how many numbers in the array are smaller than it.
// That is, for each nums[i] you have to count the number of valid j's such that j != i and nums[j] < nums[i].
// Return the answer in an array.

// Example 1:

// Input: nums = [8,1,2,2,3]
// Output: [4,0,1,1,3]
// Explanation: 
// For nums[0]=8 there exist four smaller numbers than it (1, 2, 2 and 3). 
// For nums[1]=1 does not exist any smaller number than it.
// For nums[2]=2 there exist one smaller number than it (1). 
// For nums[3]=2 there exist one smaller number than it (1). 
// For nums[4]=3 there exist three smaller numbers than it (1, 2 and 2).

// Example 2:

// Input: nums = [6,5,4,8]
// Output: [2,1,0,3]

// Example 3:

// Input: nums = [7,7,7,7]
// Output: [0,0,0,0]

// Constraints:

//     2 <= nums.length <= 500
//     0 <= nums[i] <= 100

public class HowManyNumbersSmaller {
    public static void main(String[] args) {
        int[] numbers = new int[] { 8, 1, 2, 2, 3 };
        for (int number : smallerNumbersThanCurrent(numbers)) {
            System.out.println(number);
        }
        int[] numbers2 = new int[] { 6, 5, 4, 8 };
        for (int number : smallerNumbersThanCurrent(numbers2)) {
            System.out.println(number);
        }
        int[] numbers3 = new int[] { 7, 7, 7, 7 };
        for (int number : smallerNumbersThanCurrent(numbers3)) {
            System.out.println(number);
        }
    }

    private static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] numsSmaller = new int[nums.length];

        if (nums.length == 0) {
            return new int[]{};
        }

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (j != i & nums[j] < nums[i]) {
                    numsSmaller[i] += 1;
                }
            }
        }
        return numsSmaller;
    }
}
