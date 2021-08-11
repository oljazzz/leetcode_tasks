package medium;

import java.util.Arrays;

public class UniqueCharacter {

    final int MAX_CHAR = 255;

    boolean uniqueCharacters(String str) {
        if (str.length() > MAX_CHAR) {
            return false;
        }

        boolean[] chars = new boolean[MAX_CHAR];
        Arrays.fill(chars, false);

        for (int i = 0; i < str.length(); i++) {
            int index = (int) str.charAt(i);
            if (chars[index]) {
                return false;
            }
            chars[index] = true;
        }
        return true;

    }

}
