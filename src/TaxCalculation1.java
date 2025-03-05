public class TaxCalculation1 {
        public static void main(String[] args) {
                // Использование double
                double netPriceDouble = 9.99;
                double vatRateDouble = 0.23;

                // Расчет стоимости с НДС
                double grossPriceDouble = netPriceDouble * (1 + vatRateDouble);

                // Расчет общей стоимости для 10,000 единиц с НДС
                double totalGrossDouble = grossPriceDouble * 10000;

                // Расчет общей стоимости для 10,000 единиц без НДС
                double totalNetDouble = totalGrossDouble / (1 + vatRateDouble);

                // Вывод результатов для double
                System.out.println("Using double:");
                System.out.println("Gross price for one item: " + grossPriceDouble);
                System.out.println("Total gross price for 10,000 items: " + totalGrossDouble);
                System.out.println("Total net price for 10,000 items: " + totalNetDouble);
                System.out.println();
        }
}