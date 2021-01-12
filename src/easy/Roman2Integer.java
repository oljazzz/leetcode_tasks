package easy;

import java.util.HashMap;
import java.util.Map;

public class Roman2Integer {


    public static void main(String[] args) {
        Roman2Integer roman2Integer = new Roman2Integer();
        System.out.println(roman2Integer.romanToInt("III"));
    }

    public int romanToInt(String s) {
        int result = 0;
        HashMap<Character, Integer> map = getRomanSymbolsMap();
        for (int i = 0; i < s.length(); i++) {
            int first = map.get(s.charAt(i));
            if (i + 1 < s.length()) {
                char second = s.charAt(i + 1);
                if (first >= map.get(second)) {
                    result += first;
                } else {
                    result -= first;
                }
            } else {
                result = result + first;
            }
        }
        return result;
    }

    private HashMap<Character, Integer> getRomanSymbolsMap() {
        HashMap<Character, Integer> roman = new HashMap<>();
        roman.put('I', 1);
        roman.put('V', 5);
        roman.put('X', 10);
        roman.put('L', 50);
        roman.put('C', 100);
        roman.put('D', 500);
        roman.put('M', 1000);
        return roman;
    }
}
