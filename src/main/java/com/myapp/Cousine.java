package com.myapp;

public abstract class Cousine {
	public abstract void showMenu();

	public abstract void addDish(Dish dish);

	public abstract void init();

	public abstract Lunch makeOrder();

	public static Cousine getCousine(String cousine) {
		if (cousine.equalsIgnoreCase("polish"))
			return new PolishCousine();
		if (cousine.equalsIgnoreCase("mexican"))
			return new MexicanCousine();
		if (cousine.equalsIgnoreCase("italian"))
			return new ItalianCousine();
		else
			throw new IllegalArgumentException();
	}
}
