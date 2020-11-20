package com.aginskiy.training.entity;

import java.math.BigDecimal;
import java.util.Objects;

public class Book {
    private int id;
    private String title;
    private Author author;
    private Publisher publisher;
    private int publicationYear;
    private int numberPages;
    private BigDecimal cost;
    private Cover cover;

    public Book() {

    }

    public Book(int id, String title, Author author, Publisher publisher, int publicationYear, int numberPages,
                BigDecimal cost, Cover cover) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.publicationYear = publicationYear;
        this.numberPages = numberPages;
        this.cost = cost;
        this.cover = cover;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public int getNumberPages() {
        return numberPages;
    }

    public void setNumberPages(int numberPages) {
        this.numberPages = numberPages;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    public Cover getCover() {
        return cover;
    }

    public void setCover(Cover cover) {
        this.cover = cover;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return id == book.id &&
                publicationYear == book.publicationYear &&
                numberPages == book.numberPages &&
                cost == book.cost &&
                title.equals(book.title) &&
                author.equals(book.author) &&
                cover.equals(book.cover);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, author, publicationYear, numberPages, cost, cover);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Book{");
        sb.append("id=").append(id);
        sb.append(", title='").append(title).append('\'');
        sb.append(", author=").append(author);
        sb.append(", publisher=").append(publisher);
        sb.append(", publicationYear=").append(publicationYear);
        sb.append(", numberPages=").append(numberPages);
        sb.append(", cost=").append(cost);
        sb.append(", cover=").append(cover);
        sb.append("}\n");
        return sb.toString();
    }
}
