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
		Librarian librarian = new Librarian();
		Library library = new Library();
		Book b = new Book();


		library.addBooks(new Book("Becoming", "Michelle Obama", 400, 2018));
		library.addBooks(new Book("Educated: A Memoir", "Tara Westover", 352, 2018));
		library.addBooks(new Book("Clean Code", "Robert C. Martin", 464, 2008));


		do {

			librarian.welcomeToLibrary();

			int userChoice = scan.nextInt();


			switch (userChoice) {

				case 1:

					System.out.println("There are " + library.numberOfBooksInLibrary() + " books in the library");

					library.printLibrary();

					break;

				case 2:


                    b = librarian.collectingBookData();

					library.addBooks(b);

					library.printLibrary();


					break;


				case 3:


                    String title = librarian.searchForBooks();

					library.searchBook(title);

					break;

				case 4 :


				    library.printLibrary();

				    int option = librarian.promptForDeletion();

					library.deleteBookFromLibrary(option);

					 break;

				case 5:

					library.updateBookInformation();

					break;

				case 6 :

					System.out.println("Thank you for visiting the library");
					break;

                default:
                    System.out.println("Not a valid option.");


            }

		System.out.println("Would you like to continue? Y for yes, N for no.");

			userContinue = scan.next();

		}while (userContinue.equals("y"));

        System.out.println("Thank you for visiting the library");
	}


}
