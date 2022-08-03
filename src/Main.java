public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        int creditAmount = 1_000_000;
        double interestRate = 0.0999;


        int numberYear = 1;

        double oneYear = service.calculate(creditAmount, numberYear, interestRate);
        System.out.println(oneYear);

        numberYear = 2;

        double twoYear = service.calculate(creditAmount, numberYear, interestRate);
        System.out.println(twoYear);

        numberYear = 3;

        double threeYear = service.calculate(creditAmount, numberYear, interestRate);
        System.out.println(threeYear);
    }
}
