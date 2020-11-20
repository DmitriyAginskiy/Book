package com.aginskiy.training.entity.comparator;

import com.aginskiy.training.entity.Book;

import java.util.Comparator;

public class BookNumberPagesComparator implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        return Integer.compare(o1.getNumberPages(), o2.getNumberPages());
    }
}
