package Two_Pointer;

import java.util.Arrays;

public class TripletSmalestSum {
    public static void main(String[] args) {

        int n = 4;
        int sum = 2;
        long arr[] = {-2, 0, 1, 3};
        System.out.println(countTriplets(n, sum, arr));
    }

    public static long countTriplets(int n, int sum, long arr[]) {

        Arrays.sort(arr);
        long count = 0;

        for (int i = 0; i < n - 2; i++) {
            int left = i + 1, right = n - 1;
            while (left < right) {
                long currentSum = arr[i] + arr[left] + arr[right];
                if (currentSum < sum) {
                    count += (right - left);
                    left++;
                } else {
                    right--;
                }
            }
        }
        return count;
    }
}
