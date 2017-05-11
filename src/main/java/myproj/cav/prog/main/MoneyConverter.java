package myproj.cav.prog.main;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;

public class MoneyConverter {

	public static void main(String[] args) {
		Double price = 10.2;

		
		
		NumberFormat numberFormatterGB = NumberFormat.getNumberInstance(Locale.UK);
		numberFormatterGB.setMinimumFractionDigits(2);
		System.out.println(numberFormatterGB.format(price));
		
		NumberFormat numberFormatterUS = NumberFormat.getNumberInstance(Locale.US);
		numberFormatterUS.setMinimumFractionDigits(2);
		System.out.println(numberFormatterUS.format(price));
		
		NumberFormat numberFormatterFR = NumberFormat.getNumberInstance(Locale.FRANCE);
		numberFormatterFR.setMinimumFractionDigits(2);
		BigDecimal fundPrice = BigDecimal.valueOf(price).setScale(2, BigDecimal.ROUND_HALF_UP);
		System.out.println(numberFormatterUS.format(fundPrice));

	}

}
