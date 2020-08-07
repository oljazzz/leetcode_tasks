import java.util.Arrays;

public class Task1480 {
    public static void main(String[] args) {
        RunningSumOf1dArray array = new RunningSumOf1dArray();
        int[] input = {3,1,2,10,1};
        System.out.println("array = " + Arrays.toString(array.runningSum(input)));
    }
}
