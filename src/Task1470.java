import java.util.Arrays;

public class Task1470 {
    public static void main(String[] args) {
        ShuffleTheArray shuffleTheArray = new ShuffleTheArray();
        int[] nums = {2,5,1,3,4,7};
        int n = 3;
        System.out.println("shuffleTheArray = " + Arrays.toString(shuffleTheArray.shuffle(nums, n)));
    }
}
