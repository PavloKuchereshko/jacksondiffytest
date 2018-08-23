package com.pkuch.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Books {

    @JsonProperty("books")
    private List<Book> books;

    @JsonProperty("books")
    public List<Book> getBooks() {
        return books;
    }

    @JsonProperty("books")
    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
