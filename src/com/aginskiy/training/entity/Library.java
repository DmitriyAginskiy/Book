package com.aginskiy.training.entity;

import java.util.Arrays;

public class Library {
    private Book[] books;

    public Library() {

    }

    public Library(Book[] books) {
        this.books = books;
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Library library = (Library) o;
        return Arrays.equals(books, library.books);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(books);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Library{");
        sb.append("books=").append(Arrays.toString(books));
        sb.append('}');
        return sb.toString();
    }
}
