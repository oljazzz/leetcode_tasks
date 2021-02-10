package medium;

public class HappyNumber {

    public static boolean find(int num) {
        int slow = num, fast = num;
        do {
            slow = findSquareSum(slow);
            fast = findSquareSum(findSquareSum(fast));
        } while (slow != fast);
        return slow == 1;

    }

    private static int findSquareSum(int num) {
        int sum = 0;
        int digit = 0;
        while (num > 0) {
            digit = num % 10;
            sum += digit * digit;
            num /= 10;
        }
        return sum;
    }


    public static void main(String[] args) {
        System.out.println("HappyNumber.find(2) = " + HappyNumber.find(2));

    }
}
