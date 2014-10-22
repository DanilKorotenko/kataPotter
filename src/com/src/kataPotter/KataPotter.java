package com.src.kataPotter;

import java.util.HashMap;
import java.util.Map;

public class KataPotter 
{

	public static void main(String[] args) 
	{
		Map<Integer, Integer> bookMap = new HashMap<Integer, Integer>();
		bookMap.put(1, 1);
		bookMap.put(2, 2);
		bookMap.put(3, 2);
		bookMap.put(4, 2);
		bookMap.put(5, 2);
		bookMap.put(6, 1);
		
		BookSet bookSet = new BookSet(bookMap);
		
		System.out.println("Hello kata potter.");
		
		System.out.println("book series:" + bookSet.numberOfSeries());
		System.out.println("books quantity:" + bookSet.numberOfBooks());
		
		System.out.println("total price:" + 
				BookSetCalculator.calculatePrice(bookSet));
		
	}

}
