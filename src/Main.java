public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        int creditAmount = 1_000_000;
        double interestRate = 9.99;


        int year = 1;

        int oneYear = service.calculate(creditAmount, year, interestRate);
        System.out.println(oneYear);

        year = 2;

        int twoYear = service.calculate(creditAmount, year, interestRate);
        System.out.println(twoYear);

        year = 3;

        int threeYear = service.calculate(creditAmount, year, interestRate);
        System.out.println(threeYear);
    }
}
