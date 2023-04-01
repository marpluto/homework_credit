public class CreditPaymentService {
    public int calculate(int rub, int years) {
        double percent = 9.99;
        double pm = percent / 12 / 100;
        int result = (int) (rub * pm * (Math.pow(1 + pm, years * 12) / (Math.pow(1 + pm, years * 12) - 1)));
        return result;
    }
}
