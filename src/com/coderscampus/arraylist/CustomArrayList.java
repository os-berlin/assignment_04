package com.coderscampus.arraylist;

public class CustomArrayList<T> implements CustomList<T> {
	Object[] items = new Object[10];
	
	private Integer currentIndex = 0;

	@Override
	public boolean add(T item) {
		if (currentIndex == items.length) {
			Object[] biggerArray = new Object[currentIndex * 2];
			for (int i = 0; i < currentIndex; i++) {
				biggerArray[i] = items[i];
			}
			items = biggerArray;
		}
		items[currentIndex] = item;
		currentIndex += 1;
		return true;
	}

	@Override
	public int getSize() {
		return currentIndex;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T get(int index) {		
		return (T)items[index];
	}
	
}
