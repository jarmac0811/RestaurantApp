package com.myapp;

public class Lunch {
	private Dish mainDish;
	private Dessert dessert;

	public Lunch(Dish mainDish, Dessert dessert) {
		this.mainDish = mainDish;
		this.dessert = dessert;
	}

	public float getPrice() {
		return mainDish.getPrice() + dessert.getPrice();
	}

	public void getInfo() {
		System.out.println("You ordered " + mainDish.getName() + " with " + dessert.getName() + " and the price is "
				+ (mainDish.getPrice() + dessert.getPrice()));
	}
}
