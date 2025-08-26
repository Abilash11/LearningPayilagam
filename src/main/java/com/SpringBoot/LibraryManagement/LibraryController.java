package com.SpringBoot.LibraryManagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class LibraryController {

    @Autowired
    private LibraryService libraryService;

    @GetMapping
    public List<LibraryEntity> getAllBooks() {
        return libraryService.findAllBooks();
    }

    @GetMapping("/search/title")
    public List<LibraryEntity> searchByTitle(@RequestParam String title) {
        return libraryService.searchByTitle(title);
    }

    @GetMapping("/search/author")
    public List<LibraryEntity> searchByAuthor(@RequestParam String author) {
        return libraryService.searchByAuthor(author);
    }

    @GetMapping("/search/category")
    public List<LibraryEntity> searchByCategory(@RequestParam String category) {
        return libraryService.searchByCategory(category);
    }

    @GetMapping("/search/availability")
    public List<LibraryEntity> searchByAvailability(@RequestParam boolean availability) {
        return libraryService.searchByAvailability(availability);
    }

    @PostMapping("/add")
    public LibraryEntity addBook(@RequestBody LibraryEntity book) {
        return libraryService.addBook(book);
    }

    @PutMapping("/lend/{id}")
    public LibraryEntity lendBook(@PathVariable int id) {
        return libraryService.lendBook(id);
    }

    @PutMapping("/return/{id}")
    public String returnBook(@PathVariable int id) {
        return libraryService.returnBook(id);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteBook(@PathVariable int id) {
        libraryService.deleteBook(id);
        return "Book deleted successfully";
    }
}

