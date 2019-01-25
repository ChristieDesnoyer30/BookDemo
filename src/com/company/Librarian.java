package com.company;

import java.util.Scanner;


public class Librarian {

    public void welcomeToLibrary(){

        System.out.println("Welcome to the library \nSelect 1 - To see how many books are in the library. " +
                "\nSelect 2 - To add a book to your library. " +
                "\nSelect 3 - To search for a book. " +
                "\nSelect 4 - To delete a book. " +
                "\nSelect 5 - To update a books information. " +
                "\nSelect 6 - To exit the library. ");
    }

    public Book collectingBookData (){

        Book book = new Book();

        Scanner scan = new Scanner(System.in);

        System.out.println("What is the Title?");

        String bookTitle = scan.nextLine();

        book.setTitle(bookTitle);

        System.out.println("Who is the author?");

        String bookAuthor = scan.nextLine();

        book.setAuthor(bookAuthor);

        System.out.println("How many pages?");

        int bookPages = scan.nextInt();

        book.setNumberOfPages(bookPages);

        System.out.println("When was it published?");

        int bookPublish = scan.nextInt();

        book.setYearPublished(bookPublish);


        return book;


    }

    public String searchForBooks(){

        Scanner scan = new Scanner(System.in);

        System.out.println("What book are you looking for?");

        String title = scan.nextLine();


        return title;
    }

    public int promptForDeletion(){
        Library library = new Library();

        Scanner scan = new Scanner(System.in);

        library.printLibrary();

        System.out.println("What book would you like to delete?");

        int option = scan.nextInt();

        return option;
    }


}
