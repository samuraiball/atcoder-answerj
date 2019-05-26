public class Frog {
    public static void main(String[] args) {

        int[] hi = {1, 2, 5, 5, 3, 9};
        int n = 6;

        int[] dp = new int[n];

        for (int i = 0; i < n; i++) dp[i] = 999999999;
        dp[0] = 0;

        for (int i = 1; i < n; i++) {
            dp[i] = dp[i - 1] + Math.abs(hi[i] - hi[i - 1]);
            if (i > 1) {
                int tmp = dp[i - 2] + Math.abs(hi[i] - hi[i - 2]);
                dp[i] = dp[i] < tmp ? dp[i] : tmp;
            }
        }
        System.out.println(dp[n - 1]);
    }
}
