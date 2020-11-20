package com.aginskiy.training.builder;

import com.aginskiy.training.entity.*;

import java.math.BigDecimal;
import java.util.Random;

public class LibraryBuilder {
    public Library generateLibrary(int booksNumber) {
        Random random = new Random();
        int count = 0;
        Book[] books = new Book[booksNumber];
        Author author;
        Publisher publisher;
        BigDecimal cost;
        String[] authorsNames = {"Толстой", "Лермонтов", "Тургенев", "Чехов", "Роулинг", "Карнеги", "Масао", "Шарма"};
        String[] countries = {"Беларусь", "Норвегия", "Великобритания", "Швеция", "Дания", "Швейцария", "Германия", "Польша"};
        String[] publisherNames = {"Фламинго", "Ювента", "Экзамен", "Эксмо", "Росмэн", "Рипол", "Аттикус", "Азбука"};
        String[] directors = {"Дагиль", "Лыфарь", "Ванин", "Горнич", "Кузнецов", "Коноплёва", "Калюжная", "Ермолович"};
        for (int i = 0; i < booksNumber; i++) {
            author = new Author(authorsNames[random.nextInt(8)], 20 + random.nextInt(60),
                                countries[random.nextInt(8)]);
            publisher = new Publisher(publisherNames[random.nextInt(8)], directors[random.nextInt(8)]);
            cost = new BigDecimal(1 + random.nextDouble() * 100);
            books[i] = new Book(count++, "Book" + count, author, publisher, 1900 + random.nextInt(120),
                    100 + random.nextInt(900), cost, Cover.HARD);
        }
        Library library = new Library(books);
        return library;
    }
}
