package easy;

public class MaxSumSubArrayOfSizeK {
    public static int findMaxSubArray(int k, int[] arr) {
        int windowSum = 0;
        int maxSum = 0;
        int windowStart = 0;
        for (int windowEnd = 0; windowEnd < arr.length; windowEnd++) {
            windowSum += arr[windowEnd];
            if (windowEnd >= k - 1) {
                maxSum = Math.max(maxSum, windowSum);
                windowSum -= arr[windowStart];
                windowStart++;
            }
        }
        return maxSum;
    }


    public static void main(String[] args) {
        int sum = MaxSumSubArrayOfSizeK.findMaxSubArray(3, new int[]{2,1,5,1,3,2});
        System.out.println("sum = " + sum);
    }
}
