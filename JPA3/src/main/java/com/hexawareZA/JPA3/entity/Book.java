package com.hexawareZA.JPA3.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "books")
public class Book {

    @Column(name = "book_id")
    private String id;

    @Column(name = "book_name")
    private String name;

    @ManyToOne
    private Library library;

    public String getId() {
        return id;
    }

    public Book() {
    }

    public Book(String id, String name, Library library) {
        this.id = id;
        this.name = name;
        this.library = library;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Library getLibrary() {
        return library;
    }

    public void setLibrary(Library library) {
        this.library = library;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
