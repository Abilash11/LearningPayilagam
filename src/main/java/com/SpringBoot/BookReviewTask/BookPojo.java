package com.SpringBoot.BookReviewTask;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;

public class BookPojo {


    private Long id; //        =>id (Long, PK)

   @NotBlank
    @Size(max=100)
    private String title;            //    =>title (String, required, max 100 chars)

     @NotBlank
    private String author;             //=>author (String, required)

    private LocalDate publishedDate;

//@Enumerated(EnumType.STRING)
//public  Genre genre;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public LocalDate getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(LocalDate publishedDate) {
        this.publishedDate = publishedDate;
    }



    private enum Genre {
        FICTION, NONFICTION, MYSTERY, SCIENCE, OTHER
    }

}
