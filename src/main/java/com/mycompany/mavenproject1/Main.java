/*Team:-
1- Ahmed Ashraf Mosa           [IT]
2- ALi Ayman EL-Beltagy        [IT] 
3- Omar Ashraf Ashba           [IT]
4- Kamal Mohammed Agha         [IT]
5- Mohammed Ahmed Shama        [IS]
6- Mohammed Reda Elkamhawy     [IT]
7- Mohammed Abdelsamed Mahmoud [IT]
8- Mohammed Emad Hezema        [IT]
9-Mo'men Ahmed Al-Rashidi      [IT]               
*/
package com.mycompany.mavenproject1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Library library = new Library();
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.println("Enter 1 to add a book to the library");
                System.out.println("Enter 2 to check out a book from the library");
                System.out.println("Enter 3 to return a book to the library");
                System.out.println("Enter 4 to list all books in the library");
                System.out.println("Enter 0 to exit");

                int choice = scanner.nextInt();
                if (choice == 0) {
                    break;
                }

                switch (choice) {
                    case 1 -> {
                        System.out.print("Enter the title of the book: ");
                        String title = scanner.next();
                        System.out.print("Enter the author of the book: ");
                        String author = scanner.next();
                        library.addBook(new Book(title, author));
                        System.out.println("Book added to library");
                    }
                    case 2 -> {
                        System.out.print("Enter the title of the book: ");
                        String title = scanner.next();
                        if (library.checkOutBook(title)) {
                            System.out.println("Book checked out");
                        } else {
                            System.out.println("Book not found or already checked out");
                        }
                    }
                    case 3 -> {
                        System.out.print("Enter the title of the book: ");
                        String title = scanner.next();
                        if (library.returnBook(title)) {
                            System.out.println("Book returned");
                        } else {
                            System.out.println("Book not found or already in the library");
                        }
                    }
                    case 4 -> {
                        ArrayList<Book> books = library.getBooks();
                        for (Book book : books) {
                            System.out.println(book.getTitle() + " by " + book.getAuthor() + " ("
                                    + (book.isCheckedOut() ? "checked out" : "available") + ")");
                        }
                    }
                }
            }
        }
    }
}

class Book {
    private final String title;
    private final String author;
    private boolean checkedOut;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.checkedOut = false;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isCheckedOut() {
        return checkedOut;
    }

    public void setCheckedOut(boolean checkedOut) {
        this.checkedOut = checkedOut;
    }
}

class Library {
    public boolean returnBook(String title) {
        return false;
    }

    public ArrayList<Book> getBooks() {
        return null;
    }

    public void addBook(Book book) {
    }

    public boolean checkOutBook(String title) {
        return false;
    }
}