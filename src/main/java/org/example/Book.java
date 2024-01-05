package org.example;

public class Book {
    private final String nameBook;

    public Book(String nameBook) {
        this.nameBook = nameBook;
    }

    public String getNameBook() {
        return nameBook;
    }
    @Override
    public String toString() {
        return '\"' + nameBook + '\"';
    }
}
