package com.myapp;

import java.util.Scanner;

public class RestaurantApp {
	public void order() {
		System.out.println("For ordering lunch press 1, for drink press 2");
		Scanner scanner = new Scanner(System.in);
		int option = scanner.nextInt();
		if (option == 1)
			orderLunch();
		else if (option == 2)
			orderDrink();

		else
			System.out.println("Incorrect number");
	}

	private  void orderDrink() {
		Bar bar = new Bar();
		bar.init();
		System.out.println("1.Cola\n2.Wodka\n3.Tea");
		Scanner scanner = new Scanner(System.in);
		int option = scanner.nextInt();
		Drink drink = bar.get(option);
		System.out.println("For lemon press 1 for ice cubes press 2 for both press 3");
		option = scanner.nextInt();
		switch (option) {
		case 1:
			drink.setIceCubs(true);
			break;
		case 2:
			drink.setLemon(true);
			break;
		case 3:
			drink.setIceCubs(true);
			drink.setLemon(true);

		}
		drink.getInfo();
		scanner.close();
	}

	private  void orderLunch() {
		System.out.println("Choose cousine from polish, italian and mexican");
		Scanner scanner = new Scanner(System.in);
		String option = scanner.next();
		Cousine cousine = Cousine.getCousine(option);
		cousine.init();
		cousine.showMenu();
		// Lunch lunch=new Lunch();
		Lunch lunch = cousine.makeOrder();
		lunch.getInfo();
		scanner.close();
	}
}
