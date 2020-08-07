public class NumberOfGoodPairs {
    public int numIdenticalPairs(int[] nums) {
        int goodPairsCount = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int first = nums[i];
                int second = nums[j];
                if (first == second) {
                    goodPairsCount++;
                }
            }
        }
        return goodPairsCount;
    }
}
