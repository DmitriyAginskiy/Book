package com.aginskiy.training.service;

import com.aginskiy.training.entity.Author;
import com.aginskiy.training.entity.Book;
import com.aginskiy.training.entity.Library;


public class LibraryService {
    public Book[] searchBooksByAuthor(Library library, Author author) {
        Book[] books = library.getBooks();
        int numberBooksByAuthor = 0;
        for (Book b : books) {
            if (b.getAuthor().equals(author)) {
                ++numberBooksByAuthor;
            }
        }
        Book[] booksByAuthor = new Book[numberBooksByAuthor];
        int counter = 0;
        for (int i = 0; i < books.length; i++) {
            if (books[i].getAuthor().equals(author)) {
                booksByAuthor[counter] = books[i];
                ++counter;
            }
        }
        return booksByAuthor;
    }

    public Book[] searchBooksByYear(Library library, int publicationYear) {
        Book[] books = library.getBooks();
        int numberBooksByYear = 0;
        for (Book b : books) {
            if (b.getPublicationYear() > publicationYear) {
                ++numberBooksByYear;
            }
        }
        Book[] booksByAuthor = new Book[numberBooksByYear];
        int counter = 0;
        for (int i = 0; i < books.length; i++) {
            if (books[i].getPublicationYear() > publicationYear) {
                booksByAuthor[counter] = books[i];
                ++counter;
            }
        }
        return booksByAuthor;
    }

    public void swapBooks(Book[] books, int firstInd, int secondInd) {
        Book buff = books[firstInd];
        books[firstInd] = books[secondInd];
        books[secondInd] = buff;
    }

    public Book[] sortBooksByYear(Library library) {
        Book[] books = library.getBooks();
        for (int i = 0; i < books.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < books.length; j++) {
                if (books[minIndex].getPublicationYear() > books[j].getPublicationYear()) {
                    minIndex = j;
                }
            }
            swapBooks(books, i, minIndex);
        }
        return books;
    }

    public Book[] sortBooksByNumberPages(Library library) {
        Book[] books = library.getBooks();
        for (int i = 0; i < books.length - 1; i++) {
            for (int j = 0; j < books.length - i - 1; j++) {
                if (books[j].getNumberPages() > books[j + 1].getNumberPages()) {
                    swapBooks(books, j, j + 1);
                }
            }
        }
        return books;
    }
}
