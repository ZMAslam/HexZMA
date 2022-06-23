package com.hexawareZA.JPA3.controller;

import com.hexawareZA.JPA3.entity.Book;
import com.hexawareZA.JPA3.entity.Library;
import com.hexawareZA.JPA3.repository.LibraryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class LibraryController {

    @Autowired
    private LibraryRepo libraryRepo;

    @GetMapping("/save")
    // Populate the table
    public void populate() {
        Library reston = new Library(101L, "Reston Library");
        Library gumspring = new Library(102L, "Gum Spring Library");
        Book lotr = new Book("85u9dd", "The Lord of the Rings", reston);
        Book howto = new Book("98jkuiy", "How to Win Friends", gumspring);
        Book habits = new Book ("1948uk", "7 Habits", reston);
        Book positive = new Book ("Ijhu786", "The Power of Positive Thinking", reston);
        reston.addBook(lotr);
        reston.addBook(habits);
        reston.addBook(positive);
        gumspring.addBook(lotr);
        libraryRepo.save(reston);
        libraryRepo.save(gumspring);
    }

    @GetMapping("/list/{id}")
    public List<Book> findAll(@RequestParam long id) {
        Library lib = libraryRepo.findById(id).orElse(null);
        return lib.getBookList();
    }

    @GetMapping("/count")
    public List<Integer> counts() {
        List<Integer> result = new ArrayList<>();
        libraryRepo.findAll().forEach(e -> result.add(e.getBookList().size()));
        return result;
    }
}
