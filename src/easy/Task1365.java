package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.stream.IntStream;

//How Many Numbers Are Smaller Than the Current Number
public class Task1365 {

    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] smallerNumbers = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int current = nums[i];
            int count = 0;
            for (int second : nums) {
                if (second < current) {
                    count++;
                }
                smallerNumbers[i] = count;

            }
        }
        return smallerNumbers;
    }


    public static void main(String[] args) {
        Task1365 task1365 = new Task1365();
        int[] input = new int[]{8, 1, 2, 2, 3};
        int[] result = task1365.smallerNumbersThanCurrent(input);
        System.out.println("result = " + Arrays.toString(result));
    }
}
