package com.myapp;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		RestaurantApp restaurant = new RestaurantApp();
		System.out.println("Select option:\n1)make order\n2)exit");
		Scanner scanner = new Scanner(System.in);
		int option = scanner.nextInt();
		switch (option) {
		case 1:
			restaurant.order();
		case 2:
			System.exit(0);
		}
	}

}
