package easy;

import java.util.Arrays;

public class PairWithTargetSum {

    public static int[] search(int[] arr, int targetSum) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int currentSum = arr[left] + arr[right];
            if (currentSum == targetSum) {
                return new int[]{left, right};
            }
            if (targetSum > currentSum) {
                left++;
            } else {
                right--;
            }
        }
        return new int[]{-1, -1};
    }


    public static void main(String[] args) {
        int[] result = PairWithTargetSum.search(new int[]{3, 2, 4}, 6);
        System.out.println("result = " + Arrays.toString(result));

    }
}
