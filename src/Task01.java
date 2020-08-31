import java.util.Arrays;

public class Task01 {

    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        System.out.println("twoSum.twoSum() = " + Arrays.toString(twoSum.twoSum(nums, target)));
        System.out.println("*****");

        int[] nums1 = {3, 2, 4};
        int target1 = 6;
        System.out.println("twoSum.twoSum() = " + Arrays.toString(twoSum.twoSum(nums1, target1)));


    }
}
