package easy;

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
}
