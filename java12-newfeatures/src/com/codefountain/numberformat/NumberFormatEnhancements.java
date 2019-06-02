package com.codefountain.numberformat;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * {@link NumberFormat} changes in Java 12
 * 
 * @author Somnath Musib
 *
 */
public class NumberFormatEnhancements {

	public static void main(String[] args) {
		
		NumberFormat numberFormat = NumberFormat.getCompactNumberInstance();
		System.out.println(numberFormat.format(1000));
		System.out.println(numberFormat.format(1500));
		numberFormat.setMinimumFractionDigits(1);
		System.out.println(numberFormat.format(1500));
		System.out.println(numberFormat.format(2000));
		
		System.out.println("\nFormats in German");
		NumberFormat numberFormat2 = NumberFormat.getCompactNumberInstance(Locale.GERMAN, NumberFormat.Style.SHORT);
		System.out.println(numberFormat2.format(1000));
		System.out.println(numberFormat2.format(1500));
		System.out.println(numberFormat2.format(2000));
		
	}
}
