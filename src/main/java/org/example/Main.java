package org.example;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Book captainDaughter = new Book("Капитанская дочка");
        Author alexander = new Author("Александр", "Сергеевич", "Пушкин");
        Book warAndPeace = new Book("Война и мир");
        Author lev = new Author("Лев", "Николаевич", "Толстой");
        Book master = new Book("Мастер и Маргарита");
        Author mikhail = new Author("Михаил", "Афанасьевич", "Булгаков");

        Map<Book, Author> bookAndAuthor = new HashMap<>(){
           public String toString(){
               StringBuilder sb = new StringBuilder();
               forEach ((Book,Author) -> sb.append(Book).append(" ").append(Author).append("; "));
               return sb.toString();
           }
        };

        bookAndAuthor.put(captainDaughter,alexander);
        bookAndAuthor.put(warAndPeace,lev);
        bookAndAuthor.put(master,mikhail);

        System.out.println(bookAndAuthor);
    }
}