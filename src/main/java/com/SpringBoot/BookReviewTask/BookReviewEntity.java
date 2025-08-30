package com.SpringBoot.BookReviewTask;

import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import org.springframework.stereotype.Service;

import java.awt.print.Book;

@Service
public class BookReviewEntity {


   @Id
   private Long id; //       =>id (Long, PK)

    @Min(1)
    @Max(5)
    private  int rating ;
//    =>rating (Integer, 1 to 5)

   private  String comment;

   @NotBlank
   private  String ReviewerName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "book_id")//>> fk column in review table
    private Book book;

    @NotBlank
    private  String reviewerName;


}
