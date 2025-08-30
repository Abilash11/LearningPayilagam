package com.SpringBoot.BookReviewTask;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class BookEntity {

    @Id
    private Long id; //        =>id (Long, PK)

    private String title;            //    =>title (String, required, max 100 chars)


    private String author;             //=>author (String, required)

    private LocalDate publishedDate;
    @Enumerated(EnumType.STRING)
    private  Genre genre;


    private enum Genre {
        FICTION, NONFICTION, MYSTERY, SCIENCE, OTHER
    }






}

