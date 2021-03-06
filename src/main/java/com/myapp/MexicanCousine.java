package com.myapp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MexicanCousine extends Cousine {
	private List<Dish> dishes = new ArrayList<>();
	private List<Dessert> desserts = new ArrayList<>();

	public void addDish(Dish dish) {
		dishes.add(dish);
	}

	public void showMenu() {

		System.out.println("Mexican Cousine:\nMain dishes");
		for (int i = 0; i < dishes.size(); i++)
			System.out.println(
					(i + 1) + ")" + "Name: " + dishes.get(i).getName() + ", price: " + dishes.get(i).getPrice());
		System.out.println("\nDesserts:");
		for (int i = 0; i < desserts.size(); i++)
			System.out.println(
					(i + 1) + ")" + "Name: " + desserts.get(i).getName() + ", price: " + desserts.get(i).getPrice());
	}

	public void init() {
		Dish rice = new Dish(1, "Rice", 50);
		Dish tortilla = new Dish(1, "Tortilla", 20);
		Dish burrito = new Dish(1, "Burito", 30);

		dishes.add(rice);
		dishes.add(tortilla);
		dishes.add(burrito);
		Dessert iceCream = new Dessert("Ice Crean", 15);
		Dessert hotChocolate = new Dessert("Hot chocolate", 25);
		Dessert shake = new Dessert("Shake", 20);
		desserts.add(iceCream);
		desserts.add(hotChocolate);
		desserts.add(shake);

	}

	public Lunch makeOrder() {
		int index = 1;
		System.out.println("\nChoose main dish");
		Scanner scanner = new Scanner(System.in);
		index = scanner.nextInt();
		Dish dish = dishes.get(index - 1);
		System.out.println("Choose dessert");
		index = scanner.nextInt();
		Dessert dessert = desserts.get(index - 1);
		Lunch lunch = new Lunch(dish, dessert);
		scanner.close();
		return lunch;
	}
}
