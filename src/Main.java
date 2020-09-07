public class Main {
    public static void main(String[] args) {
        int accountSum = 100;
        int accountTopup = 1100;
        int bonusSum;
        int accountBalance = accountSum + accountTopup;
        if (accountTopup > 1000) {
            bonusSum = accountTopup / 100;
            accountBalance = accountSum + accountTopup + bonusSum;
        } else {
            bonusSum = 0;
        }
        System.out.println(bonusSum);
    }
}
