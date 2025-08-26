package com.SpringBoot.LibraryManagement;

import com.SpringBoot.LearningPayilagam.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class LibraryService {

    @Autowired
    private LibraryRepository libraryRepository;

    public List<LibraryEntity> findAllBooks() {
        return libraryRepository.findAll();
    }

    public List<LibraryEntity> searchByTitle(String title) {
        return libraryRepository.findByTitleContainingIgnoreCase(title);
    }

    public List<LibraryEntity> searchByAuthor(String author) {
        return libraryRepository.findByAuthorContainingIgnoreCase(author);
    }

    public List<LibraryEntity> searchByCategory(String category) {
        return libraryRepository.findByCategoryContainingIgnoreCase(category);
    }

    public List<LibraryEntity> searchByAvailability(boolean availability) {
        return libraryRepository.findByAvailability(availability);
    }

    public LibraryEntity addBook(LibraryEntity book) {
        return libraryRepository.save(book);
    }

    public LibraryEntity lendBook(int id) {
        LibraryEntity book = libraryRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Book not found"));
        if (!book.isAvailability()) {
            throw new RuntimeException("Book already issued");
        }
        book.setAvailability(false);
        book.setIssuedDate(LocalDate.now());
        book.setReturnDate(LocalDate.now().plusDays(14)); // return in 14 days
        return libraryRepository.save(book);
    }

    public String returnBook(int id) {
        LibraryEntity book = libraryRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Book not found"));

        if (book.isAvailability()) {
            return "This book was not issued.";
        }

        LocalDate today = LocalDate.now();
        LocalDate dueDate = book.getReturnDate();

        book.setAvailability(true);
        book.setIssuedDate(null);
        book.setReturnDate(null);
        libraryRepository.save(book);

        if (today.isAfter(dueDate)) {
            return "Book returned late! Please be punctual next time.";
        } else {
            return "Book returned successfully. Thank you!";
        }
    }

    public void deleteBook(int id) {
        if (!libraryRepository.existsById(id)) {
            throw new RuntimeException("Book not found");
        }
        libraryRepository.deleteById(id);
    }
}

