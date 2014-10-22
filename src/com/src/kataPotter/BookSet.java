package com.src.kataPotter;

import java.util.Map;

public class BookSet 
{
	private Map<Integer, Integer> _bookMap;

	public BookSet(Map<Integer, Integer> bookMap) 
	{
		super();
		this._bookMap = bookMap;
	}
	
	public int numberOfSeries()
	{
		return _bookMap.size();
	}

	public int numberOfBooks()
	{
		int result = 0;
		for (Map.Entry<Integer, Integer> entry : _bookMap.entrySet())
		{
			result += entry.getValue();
		}
		return result;
	}

}
