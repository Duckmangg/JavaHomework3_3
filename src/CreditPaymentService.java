public class CreditPaymentService {
    public double calculate(int creditAmount, int numberYear, double interestRate) {
        double numberMonth = numberYear * 12;
        double interestRatePerMonth = interestRate / 12;
        double coefficientAnnuity = interestRatePerMonth * Math.pow(1 + interestRatePerMonth, numberMonth) / (Math.pow(1 + interestRatePerMonth, numberMonth) - 1);
        double monthPayment = creditAmount * coefficientAnnuity;

        return monthPayment;
    }
}
