import java.util.ArrayList;
import java.util.List;

public class KidsWithTheGreatestNumberOfCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 1;
        List<Boolean> result = new ArrayList<>();
        for (int candy : candies) {
            if (candy > max) {
                max = candy;
            }
        }
        for (int candy : candies) {
            int checked = candy + extraCandies;
            if (checked >= max) {
                result.add(true);
            } else {
                result.add(false);
            }
        }

        return result;
    }

}
