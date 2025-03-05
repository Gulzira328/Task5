public class TaxCalculation1 {
        public static void main(String[] args) {
                double netPriceDouble = 9.99;
                double vatRateDouble = 0.23;

                double grossPriceDouble = netPriceDouble * (1 + vatRateDouble);

                double totalGrossDouble = grossPriceDouble * 10000;

                double totalNetDouble = totalGrossDouble / (1 + vatRateDouble);

                System.out.println("Using double:");
                System.out.println("Gross price for one item: " + grossPriceDouble);
                System.out.println("Total gross price for 10,000 items: " + totalGrossDouble);
                System.out.println("Total net price for 10,000 items: " + totalNetDouble);
                System.out.println();
        }
}
