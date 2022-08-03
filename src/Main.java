public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        int creditAmount = 1_000_000;
        double interestRate = 0.0999;


        int year = 1;

        double oneYear = service.calculate(creditAmount, year, interestRate);
        System.out.println(oneYear);

        year = 2;

        double twoYear = service.calculate(creditAmount, year, interestRate);
        System.out.println(twoYear);

        year = 3;

        double threeYear = service.calculate(creditAmount, year, interestRate);
        System.out.println(threeYear);
    }
}
