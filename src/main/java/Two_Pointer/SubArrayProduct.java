package Two_Pointer;

public class SubArrayProduct {
    public static void main(String[] args) {
        int[] nums = {10, 5, 2, 6};
        int k = 100;
        System.out.println(subarrayProductLessThanK(nums, k));
    }

    public static int numSubarrayProductLessThanK(int[] nums, int k) {
        int n = nums.length;
        int res = 0;

        for (int start = 0; start < n; start++) {
            int product = 1;
            for (int end = start; end < n; end++) {
                product *= nums[end];
                if (product < k) {
                    res++;
                } else
                    break;
            }
        }
        return res;
    }

    public static int subarrayProductLessThanK(int[] nums, int k) {
        if (k <= 1)
            return 0;

        int count = 0, product = 1;
        int left = 0;
        for (int right = 0; right < nums.length; right++) {
            product *= nums[right];

            while (product >= k && left <= right) {
                product /= nums[left];
                left++;
            }
            count += (right - left + 1);
        }
        return count;
    }
}
