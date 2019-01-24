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

		//- A method that allows the user to update a Book's information.
		//
		//Update your BookDemo program to provide the user with these additional options for
		// interacting with their Library.

		Scanner scan = new Scanner(System.in);
		String userContinue;
		Library library = new Library();
		Book b = new Book();


		library.addBooks(new Book("Becoming", "Michelle Obama", 400, 2018));
		library.addBooks(new Book("Educated: A Memoir", "Tara Westover", 352, 2018));
		library.addBooks(new Book("Clean Code", "Robert C. Martin", 464, 2008));


		do {
			System.out.println("Welcome to the library \nSelect 1 - To see how many books are in the library. " +
					"\nSelect 2 - To add a book to your library. \nSelect 3 - To search for a book. \nSelect 4 - To delete a book. \nSelect 5 - To update a books information. \nSelect 6 - To exit the library. ");

			int userChoice = scan.nextInt();


			switch (userChoice) {

				case 1:

					System.out.println("There are " + library.numberOfBooksInLibrary() + " books in the library");

					library.printLibrary();

					break;

				case 2:

					System.out.println("What is the Title?");

					scan.nextLine();

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


					library.addBooks(b);

					library.printLibrary();


					break;


				case 3:

					System.out.println("What book are you looking for?");

					scan.nextLine();

					String title = scan.nextLine();

					library.searchBook(title);

					break;

				case 4 :

					library.printLibrary();

					System.out.println("What book would you like to delete?");

					int option = scan.nextInt();

					library.deleteBookFromLibrary(option);

					 break;

				case 5:

					library.updateBookInformation();

					break;

				case 6 :

					System.out.println("Thank you for visiting the library");
					break;

			}

		System.out.println("Would you like to continue? Y for yes, N for no.");

			userContinue = scan.next();

		}while (userContinue.equals("y"));
	}
}
