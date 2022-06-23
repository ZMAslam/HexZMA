package com.hexawareZA.JPA3.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "Library")
public class Library {

    @Column(name = "library_id")
    private Long id;

    @Column(name = "library_name")
    private String name;

    @OneToMany(mappedBy = "library")
    private List<Book> bookList;

    public Library() {
    }

    public Library(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void addBook(Book book) {
        this.bookList.add(book);
    }
}
