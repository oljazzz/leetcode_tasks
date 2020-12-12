import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

public class MergeSortedArray {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int lenOne = m - 1;
        int lenTwo = n - 1;
        boolean should = true;
        int j = 0;
        ArrayList<Integer> mainList = new ArrayList<>();

        while (lenOne >= 0) {
            if (nums1[lenOne] == 0 && should) {

            } else {
                should = false;
                mainList.add(nums1[j]);
                j++;
            }
            lenOne--;
        }

        for (int i = 0; i < n; i++) {
            mainList.add(nums2[i]);
        }

        Collections.sort(mainList);

        ListIterator<Integer> iterator = mainList.listIterator();
        int k = 0;
        while (iterator.hasNext()) {
            nums1[k] = iterator.next();
            k++;
        }
    }

}
