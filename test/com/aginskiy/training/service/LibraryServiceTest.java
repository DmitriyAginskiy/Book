package com.aginskiy.training.service;

import com.aginskiy.training.entity.Author;
import com.aginskiy.training.entity.Book;
import com.aginskiy.training.entity.Library;
import com.aginskiy.training.builder.LibraryBuilder;
import com.aginskiy.training.entity.comparator.BookNumberPagesComparator;
import com.aginskiy.training.entity.comparator.BookYearComparator;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Random;

public class LibraryServiceTest {
    private static LibraryBuilder libraryBuilder;
    private static Library library;
    private static Book[] books;
    private static LibraryService libraryService;
    private static Author author;
    private static ArrayList<Book> sortedList = new ArrayList<Book>();

    @BeforeClass
    public void setUp() {
        Random random = new Random();
        libraryBuilder = new LibraryBuilder();
        library = libraryBuilder.generateLibrary(10);
        libraryService = new LibraryService();
        author = library.getBooks()[random.nextInt(10)].getAuthor();
        books = library.getBooks();
        for (int i = 0; i < 10; i++) {
            sortedList.add(books[i]);
        }
    }

    @Test
    public void testSearchBooksByAuthor() {
        Book[] booksByAuthor = libraryService.searchBooksByAuthor(library, author);
        boolean isDesiredAuthor = true;
        for (Book b : booksByAuthor) {
            if (!b.getAuthor().equals(author)) {
                isDesiredAuthor = false;
                break;
            }
        }
        Assert.assertTrue(isDesiredAuthor);
    }

    @Test
    public void testSearchBooksByYear() {
        Book[] booksByAuthor = libraryService.searchBooksByYear(library, 2000);
        boolean isDesiredYear = true;
        for (Book b : booksByAuthor) {
            if (b.getPublicationYear() < 2000) {
                isDesiredYear = false;
                break;
            }
        }
        Assert.assertTrue(isDesiredYear);
    }

    @Test
    public void testSortBooksByYear() {
        BookYearComparator yearComparator = new BookYearComparator();
        sortedList.sort(yearComparator);
        Book[] sortedArray = libraryService.sortBooksByYear(library);
        boolean isEqualArrays = true;
        for (int i = 0; i < books.length; i++) {
            if (!(sortedArray[i].equals(sortedList.get(i)))) {
                isEqualArrays = false;
            }
        }
        Assert.assertTrue(isEqualArrays);
    }

    @Test
    public void testSortBooksByNumberPages() {
        BookNumberPagesComparator numberPagesComparator = new BookNumberPagesComparator();
        sortedList.sort(numberPagesComparator);
        Book[] sortedArray = libraryService.sortBooksByNumberPages(library);
        boolean isEqualArrays = true;
        for (int i = 0; i < books.length; i++) {
            if (!(sortedArray[i].equals(sortedList.get(i)))) {
                isEqualArrays = false;
            }
        }
        Assert.assertTrue(isEqualArrays);
    }
}