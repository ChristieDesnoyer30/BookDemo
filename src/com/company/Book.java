package com.company;

public class Book {

   private String title;
   private String author;
   private int numberOfPages;
   private int yearPublished;

   public Book(String title, String author, int numberOfPages, int yearPublished) {
      this.title = title;
      this.author = author;
      this.numberOfPages = numberOfPages;
      this.yearPublished = yearPublished;
   }

   public Book() {
   }

   public String getTitle() {
      return title;
   }

   public void setTitle(String title) {
      this.title = title;
   }

   public String getAuthor() {
      return author;
   }

   public void setAuthor(String author) {
      this.author = author;
   }

   public int getNumberOfPages() {
      return numberOfPages;
   }

   public void setNumberOfPages(int numberOfPages) {
      this.numberOfPages = numberOfPages;
   }

   public int getYearPublished() {
      return yearPublished;
   }

   public void setYearPublished(int yearPublished) {
      this.yearPublished = yearPublished;
   }


   public void printBook(){

      System.out.println("The title of the book is " + title + ", the author is "+  author
              + ", the number of pages is "+ numberOfPages + ", the year it was published is " + yearPublished);

   }



}
