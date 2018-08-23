package com.pkuch;

import com.bazaarvoice.jolt.Diffy;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.pkuch.model.Book;
import com.pkuch.model.Books;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.List;

public class Application {
    public static void main(String[] args) throws URISyntaxException, IOException {
        ObjectMapper objectMapper = new ObjectMapper();

        URI jsonUri = new URI("https://raw.githubusercontent.com/tamingtext/book/master/apache-solr/example/exampledocs/books.json");
        URL jsonUrl = jsonUri.toURL();

        TypeFactory typeFactory = objectMapper.getTypeFactory();
        List<Book> bookList = objectMapper.readValue(jsonUrl, typeFactory.constructCollectionType(List.class, Book.class));

        System.out.println("***************************BooksList***************************");
        for (Book book : bookList) {
            System.out.println("***********************************************************");
            System.out.println(objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(book));
        }
        System.out.println("***********************************************************");

        Books books = new Books();
        books.setBooks(bookList);

        System.out.println("************************BooksObject************************");
        System.out.println(objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(books));
        System.out.println("***********************************************************");

        Diffy diffy = new Diffy();
        Diffy.Result result1 = diffy.diff(bookList.get(0), books.getBooks().get(0));
        Diffy.Result result2 = diffy.diff(bookList.get(0), books.getBooks().get(1));

        System.out.println("*************************DiffyCase1************************");
        System.out.println(result1);
        System.out.println("***********************************************************");
        System.out.println("*************************DiffyCase2************************");
        System.out.println(result2);
        System.out.println("***********************************************************");
    }
}
