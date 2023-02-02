package org.lessons.java.christmas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		boolean done = false;
		List<String> wishlist = new ArrayList<>();

		while (!done) {
			System.out.print("Write a wish to be placed on the wish list: ");
			String item = s.nextLine();

			wishlist.add(item);
			System.out.println("-------------------");
			System.out.println("You have " + wishlist.size() + " element on your list");

			System.out.println("-------------------");

			System.out.println("Do you want to add more wishes? (y/n)");
			String userChoice = s.nextLine();

			if (userChoice.equals("n")) {
				done = true;
				wishlist.sort(null);
				System.out.println("Here are all the wishes you have put on your list: ");

				for (String element : wishlist) {
					System.out.println("- " + element);
				}
			}
		}
		s.close();
	}
}
