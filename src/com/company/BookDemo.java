package com.company;

import java.util.Scanner;
import java.util.ArrayList;

public class BookDemo {

    public static void main(String[] args) {
	/*Create a new class named Book and give it at least
	++(4) properties (such as title, author, number of pages, etc.).
	++Create getter & setter methods for each variable.
	++Create a printDetails() method which will display all available information about a Book object.
    Create a new class named Library and give it (1) property: an array of Book objects.
    Library should have a numberOfBooksInLibrary() method which displays how many Books the user has in their Library.
    In a class named BookDemo, give the user (3) options:
    they can see how many books they have, add a book to their Library, or exit the program.
    If they choose to add a book, they should be prompted to enter all the necessary details about each book.
    The user should be able to add as many books as they want,
    and view the number of books in their library as often as they wish.*/

		Scanner scan = new Scanner(System.in);
		String userContinue;
		Library library = new Library();
		Book b = new Book();
		ArrayList<Book> books = new ArrayList<>();

		books.add(new Book("Becoming", "Michelle Obama", 400, 2018));
		books.add(new Book("Educated: A Memoir", "Tara Westover", 352, 2018));




		do {
			System.out.println("Welcome to the library \n Select 1 - To see how many books are in the library. " +
					"Select 2 - To add a book to your library. Select 3 - To exit your library.");

			int userChoice = scan.nextInt();

			switch (userChoice) {

				case 1:

					library.numberOfBooksInLibrary(books);

					for(Book book : books){

						book.printBook();
					}

					break;

				case 2:

					System.out.println("What is the Title?");
					scan.next();
					String bookTitle = scan.nextLine();
					b.setTitle(bookTitle);

					System.out.println("Who is the author?");
					String bookAuthor = scan.nextLine();
					b.setAuthor(bookAuthor);

					System.out.println("How many pages?");
					int bookPages = scan.nextInt();
					b.setNumberOfPages(bookPages);

					System.out.println("When was it published?");
					int bookPublish = scan.nextInt();
					b.setYearPublished(bookPublish);

					books.add(b);

					b.printBook();

					break;


				case 3:

					System.out.println("Thank you for visiting the library");

			}

		System.out.println("Would you like to continue? Y for yes, N for no.");

			userContinue = scan.next();

		}while (userContinue.equals("y"));
	}
}
