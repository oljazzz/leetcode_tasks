package easy;

import java.util.Arrays;
import java.util.HashMap;

public class PairWithTargetSumAlt {

    public static int[] search(int[] arr, int target) {
        HashMap<Integer, Integer> nums = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (nums.containsKey(target - arr[i])) {
                return new int[]{nums.get(target - arr[i]), i};
            } else {
                nums.put(arr[i], i);
            }
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[] result = PairWithTargetSumAlt.search(new int[]{3, 2, 4}, 6);
        System.out.println("result = " + Arrays.toString(result));

    }
}
