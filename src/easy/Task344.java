package easy;

//Reverse String in-place
public class Task344 {
    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length -1;
        while (left<right){
            char tempStart = s[left];
            char tempEnd = s[right];
            s[left] = tempEnd;
            s[right] =tempStart;
            left++;
            right--;
        }
    }
}
