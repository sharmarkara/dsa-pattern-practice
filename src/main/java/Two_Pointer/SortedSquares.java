package Two_Pointer;

import java.util.Arrays;

public class SortedSquares {
    public static void main(String[] args) {
        int[] nums = {-4, -1, 0, 3, 10};
        System.out.println(Arrays.toString((sortedSquares(nums))));
    }

    public static int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int left = 0, right = n - 1;
        int pos = n - 1; // fill from the end

        while (left <= right) {
            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];
            if (leftSquare > rightSquare) {
                result[pos--] = leftSquare;
                left++;
            } else {
                result[pos--] = rightSquare;
                right--;
            }
        }
        return result;
    }
}
