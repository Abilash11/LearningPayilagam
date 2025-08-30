package com.SpringBoot.BookReviewTask;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ReviewRepository extends JpaRepository<BookReviewEntity, Long> {
//    @Query("SELECT AVG(r.rating) FROM Review r WHERE r.book.id = :bookId")
//    Double findAverageRatingByBookId(@Param("bookId") Long bookId);
}

