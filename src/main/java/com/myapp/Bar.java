package com.myapp;

import java.util.ArrayList;
import java.util.List;

public class Bar {
	private List<Drink> drinks = new ArrayList<>();

	public void init() {
		Drink cola = new Drink("Cola", 10);
		Drink vodka = new Drink("Vodka", 20);
		Drink tea = new Drink("Tea", 5);
		drinks.add(cola);
		drinks.add(vodka);
		drinks.add(tea);
	}

	public void addDrink(Drink drink) {
		drinks.add(drink);
	}

	public Drink get(int index) {
		return drinks.get(index - 1);
	}
}
