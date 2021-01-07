package medium;

public class Task322 {
    public static void main(String[] args) {
        CoinChange coinChange = new CoinChange();
        int[] coins = {1, 2, 5};
        int amount = 11;
        System.out.println("coinChange.coinChange(coins,amount) = " + coinChange.coinChange(coins, amount));
    }
}
