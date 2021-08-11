package easy;

import java.util.Arrays;

public class ShuffleString {

    public static void main(String[] args) {
        String s = "aaiougrt";
        int[] indices = {4,0,2,6,7,3,1,5};
        String result = restoreString(s, indices);
        System.out.println("result = " + result);
    }

    public static String restoreString(String s, int[] indices) {
        char[] chars = new char[s.length()];
        Arrays.sort(indices);
        for (int i = 0; i < indices.length; i++) {
            int current = indices[i];
            chars[i] = s.charAt(current);

        }
        return Arrays.toString(chars);
    }


}
