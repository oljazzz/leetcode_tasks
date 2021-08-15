package easy;

import java.util.Locale;

public class IsPalindrome {

    public static boolean isPalindrome(String s) {
        String result = s.replaceAll("\\W", "").toLowerCase();
        int n = result.length();
        int low = 0;
        int high = n - 1;
        while (high > low) {
            if (result.charAt(low) != result.charAt(high)) {
                return false;
            }
            low++;
            high--;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        String result = s.replaceAll("\\W", "").toLowerCase();
        System.out.println("is palindrome = " + isPalindrome(s));
        //System.out.println("result = " + result);
    }

}
