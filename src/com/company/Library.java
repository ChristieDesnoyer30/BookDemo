package com.company;
import java.util.ArrayList;
import java.util.Scanner;

public class Library extends Book{


    private ArrayList<Book> books = new ArrayList<>();

    public ArrayList<Book> getBook() {
        return books;
    }

    public void setBook(ArrayList<Book> books) {
        this.books = books;
    }

    public void addBooks(Book book){

        books.add(book);

    }


    public int numberOfBooksInLibrary(){

        return books.size();

    }

    public void printLibrary(){

        int count = 1;

        for(Book book : books){

            System.out.print(count + ". ");

            book.printBook();

            count++;
        }
    }

    public void searchBook(String title){


        for(int i = 0; i < books.size(); i++){

            if (title.equalsIgnoreCase(books.get(i).getTitle())){

                System.out.println("There is a match in the library");
                break;

            }else {
                System.out.println( "That book does not exist in the library");
                break;
            }

        }


    }


    public void deleteBookFromLibrary(int userChoice){

        userChoice -= 1;

        books.remove(userChoice);

        printLibrary();

    }

    public void updateBookInformation(){
        Scanner scan = new Scanner(System.in);

        printLibrary();

        System.out.println("What book would you like to update?");

        int userChoice = scan.nextInt();

        userChoice -= 1;

        System.out.println("Enter new title : ");

        scan.nextLine();

        String title = scan.nextLine();

        books.get(userChoice).setTitle(title);

        System.out.println("Enter new author : ");

        String author = scan.nextLine();

        books.get(userChoice).setAuthor(author);

        System.out.println("Enter new number of pages : ");

        int numberOfPages = scan.nextInt();

        books.get(userChoice).setNumberOfPages(numberOfPages);

        System.out.println("Enter new year of publishing: ");

        int publishedYear = scan.nextInt();

        books.get(userChoice).setYearPublished(publishedYear);

        System.out.print("Changing book " + (userChoice + 1) + " ");

        books.get(userChoice).printBook();






}

}
