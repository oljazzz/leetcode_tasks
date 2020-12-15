package easy;

import java.util.ArrayList;
import java.util.Collections;

public class RichestCustomerWealth {

    public int maximumWealth(int[][] accounts) {
        ArrayList<Integer> wealth = new ArrayList<>();
        for (int[] currentArray : accounts) {
            int sum = 0;
            for (int i : currentArray) {
                sum += i;
            }
            wealth.add(sum);
        }
        Collections.sort(wealth);
        return Collections.max(wealth);

    }
}
