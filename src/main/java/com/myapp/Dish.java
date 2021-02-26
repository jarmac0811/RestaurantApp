package com.myapp;

public class Dish {
	private int id;
	private String name;
	private float price;

	public int getId() {
		return id;
	}

	public Dish(int id, String name, float price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public void setId(int id) {
		this.id = id;
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
