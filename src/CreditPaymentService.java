public class CreditPaymentService {
    public double calculate(int creditAmount, int year, double interestRate) {
        double month = year * 12;
        double interestRatePerMonth = interestRate / 12;
        double coefficientAnnuity = interestRatePerMonth * Math.pow(1 + interestRatePerMonth, month) / (Math.pow(1 + interestRatePerMonth, month) - 1);
        double monthPayment = creditAmount * coefficientAnnuity;

        return monthPayment;
    }
}
