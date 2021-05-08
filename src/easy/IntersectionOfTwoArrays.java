package easy;

import java.util.*;

public class IntersectionOfTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> list2 = new ArrayList<>(nums2.length);

        HashSet<Integer> tt = new HashSet<>();
        for (int j : nums2) {
            list2.add(j);
        }
        for (int current : nums1) {
            if (list2.contains(current)) {
                tt.add(current);
            }
        }
        List<Integer> pd = new ArrayList<>(tt);
        int[] intersection = new int[tt.size()];
        for (int i = 0; i < pd.size(); i++) {
            intersection[i] = pd.get(i);
        }
        return intersection;
    }

    public int[] intersection2(int[] nums1, int[] nums2) {
        Set<Integer> obj = new HashSet<>();
        if (nums2.length < nums1.length) {
            for (int k : nums2) {
                for (int i : nums1) {
                    if (k == i) {
                        obj.add(k);
                        break;
                    }
                }
            }
        } else {
            for (int i : nums1) {
                for (int j : nums2) {
                    if (j == i) {
                        obj.add(j);
                        break;
                    }
                }
            }
        }
        List<Integer> obj1 = new ArrayList<>(obj);
        int[] array = new int[obj1.size()];
        for (int z = 0; z < obj1.size(); z++) {
            array[z] = Integer.parseInt(String.valueOf(obj1.get(z)));
        }
        return array;


    }


    public static void main(String[] args) {
        IntersectionOfTwoArrays s = new IntersectionOfTwoArrays();
        int[] nums1 = new int[]{4, 9, 5};
        int[] nums2 = new int[]{9, 4, 9, 8, 4};

        System.out.println("s.intersection(nums1,nums2) = " + Arrays.toString(s.intersection2(nums1, nums2)));

    }
}
