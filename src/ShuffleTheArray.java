public class ShuffleTheArray {
    public int[] shuffle(int[] nums, int n) {
        int[] shuffledArray = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                shuffledArray[i] = nums[i / 2];
            } else {
                shuffledArray[i] = nums[i / 2 + n];
            }
        }

        return shuffledArray;
    }
}
