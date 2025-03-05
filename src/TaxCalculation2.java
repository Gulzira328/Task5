import java.math.BigDecimal;
import java.math.RoundingMode;

public class TaxCalculation2 {
    public static void main(String[] args) {
        BigDecimal netPriceBigDecimal = new BigDecimal("9.99");
        BigDecimal vatRateBigDecimal = new BigDecimal("0.23");

        BigDecimal grossPriceBigDecimal = netPriceBigDecimal.multiply(BigDecimal.ONE.add(vatRateBigDecimal));

        BigDecimal totalGrossBigDecimal = grossPriceBigDecimal.multiply(new BigDecimal("10000"));

        BigDecimal totalNetBigDecimal = totalGrossBigDecimal.divide(BigDecimal.ONE.add(vatRateBigDecimal), RoundingMode.HALF_UP);

        System.out.println("Using BigDecimal:");
        System.out.println("Gross price for one item: " + grossPriceBigDecimal);
        System.out.println("Total gross price for 10,000 items: " + totalGrossBigDecimal);
        System.out.println("Total net price for 10,000 items: " + totalNetBigDecimal);

    }
    }
