package com.day2.q2;

import java.util.Scanner;

public class BookStoreApp {
	private static Scanner in;
	
	public static void main(String[] args) {
		BookStore store = new BookStore();
		int choice, noOfCopies;
		String title,isbn,author;
		in = new Scanner(System.in);
		do {
			System.out.println("1. Display Books");
			System.out.println("2. Sell Books");
			System.out.println("3. Order Books");
			System.out.println("0. Exit");
			System.out.print("Enter your choice: ");
			choice = in.nextInt();
			switch (choice) {
			case 1:
				store.displayBookStoreContent();
				break;
			case 2:
				String ch;
				if(store.getCounter()>0) {
					do {
						in.nextLine();
						System.out.print("Enter book title: ");
						title = in.nextLine();
						System.out.print("Enter number of copies: ");
						noOfCopies = in.nextInt();
						store.sell(title, noOfCopies);
						System.out.print("Do you want to sell another book? [Yes/No] ");
						in.nextLine();
						ch = in.nextLine();
					} while (ch.equalsIgnoreCase("yes"));
				}
				else {
					System.out.println("---- EMPTY SOTRE -----");
				}
				break;
			case 3:
				String chose;
				do {
					in.nextLine();
					System.out.print("Enter book isbn: ");
					isbn = in.nextLine();
					System.out.print("Enter book title: ");
					title = in.nextLine();
					System.out.print("Enter author name: ");
					author = in.nextLine();
					System.out.print("Enter number of copies: ");
					noOfCopies = in.nextInt();
					store.order(title, author, isbn, noOfCopies);
					System.out.print("Do you want to order another book? [Yes/No] ");
					in.nextLine();
					chose = in.nextLine();
				} while (chose.equalsIgnoreCase("yes"));
				break;
			case 0:
				System.exit(0);
				break;
			}
		} while (true);
	}
}
