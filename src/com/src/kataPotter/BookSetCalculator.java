package com.src.kataPotter;

public class BookSetCalculator 
{
	private static final int kBookPrice = 8;
	private static final double[] kBookDiscount = 
		{
			0, 		// 0% for 0 books 
			1, 		// 0% for 1 book
			0.95,	// 5% for 2 books
			0.90,	// 10% for 3 books
			0.85,	// 15% for 4 books
			0.75,	// 25% for 5 books
			0.70,	// 30% for 6 books
			0.65	// 35% for 7 books
			};
	
	public static double discount(BookSet bookSet)
	{
		double result = 0.0;
		
		if (bookSet.numberOfSeries() > kBookDiscount.length)
		{
			result = kBookDiscount[kBookDiscount.length];
		}
		else 
		{
			result = kBookDiscount[bookSet.numberOfSeries()];
		}
		return result;
	}
	
	public static double calculatePrice(BookSet bookSet)
	{
		double result = bookSet.numberOfBooks() * kBookPrice * 
				discount(bookSet);
		return result;
	}
}
