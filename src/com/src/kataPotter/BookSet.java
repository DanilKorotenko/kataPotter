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

}
