package com.aginskiy.training.entity.comparator;

import com.aginskiy.training.entity.Book;

import java.util.Comparator;

public class BookYearComparator implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        return Integer.compare(o1.getPublicationYear(), o2.getPublicationYear());
    }
}
