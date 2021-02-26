package com.myapp;

public class Drink {
	private String name;
	private float price;
	private boolean lemon;
	private boolean iceCubs;

	public void getInfo() {
		if (lemon && iceCubs)
			System.out.println("You ordered " + name + " with lemon and ice cubs the price is " + price);
		else if (lemon)
			System.out.println("You ordered " + name + " with lemon the price is " + price);
		else if (iceCubs)
			System.out.println("You ordered " + name + " with ice cubs the price is " + price);
		else
			System.out.println("You ordered " + name + " the price is " + price);
	}

	public boolean isLemon() {
		return lemon;
	}

	public void setLemon(boolean lemon) {
		this.lemon = lemon;
	}

	public boolean isIceCubs() {
		return iceCubs;
	}

	public void setIceCubs(boolean iceCubs) {
		this.iceCubs = iceCubs;
	}

	public Drink(String name, float price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

}
