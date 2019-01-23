package com.company;
import java.util.ArrayList;

public class Library extends Book{

    private ArrayList<Book> book;

    public ArrayList<Book> getBook() {
        return book;
    }

    public void setBook(ArrayList<Book> book) {
        this.book = book;
    }

    public void numberOfBooksInLibrary(ArrayList<Book> book){

        System.out.println("There are " + book.size() + " book(s) in the library");
    }





}
