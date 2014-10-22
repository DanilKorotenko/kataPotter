package com.src.kataPotter;

public class BookSetCalculator 
{
	private static final int kBookPrice = 8;
	
	public static float calculatePrice(BookSet bookSet)
	{
		float result = bookSet.numberOfBooks() * kBookPrice;
		return result;
	}
}
