public class Main {
    public static void main(String[] args) {
        float accountSum = 100;
        float accountTopup = 1000;
        float accountBalance = accountSum + accountTopup;
        int bonusSum;
        if ( accountBalance > 1000 ) {
            bonusSum = (int) accountBalance / 100;
        } else {
            bonusSum = (int) 0;
        }
        System.out.println(bonusSum);
    }
}
