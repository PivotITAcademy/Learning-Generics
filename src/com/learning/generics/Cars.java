package com.learning.generics;

public class Cars {

	String name;
	int price;
	int makeYear;
	String color;

	public Cars(String name, int price, int makeYear, String color) {
		super();
		this.name = name;
		this.price = price;
		this.makeYear = makeYear;
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public int getMakeYear() {
		return makeYear;
	}

	public String getColor() {
		return color;
	}

}
