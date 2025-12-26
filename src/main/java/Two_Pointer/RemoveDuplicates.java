package Two_Pointer;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 3};
        int len = removeDuplicates(nums);
        System.out.println("Length: "+len);
        for (int k=0;k<len;k++)
        {
            System.out.print(nums[k]+" ");
        }
    }

    public static int removeDuplicates(int[] arr) {
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[i] != arr[j])
                i++;
            arr[i] = arr[j];
        }
        return i + 1;
    }
}
