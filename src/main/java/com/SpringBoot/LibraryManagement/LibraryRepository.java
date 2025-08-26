package com.SpringBoot.LibraryManagement;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LibraryRepository extends JpaRepository<LibraryEntity, Integer> {
    List<LibraryEntity> findByTitleContainingIgnoreCase(String title);
    List<LibraryEntity> findByAuthorContainingIgnoreCase(String author);
    List<LibraryEntity> findByCategoryContainingIgnoreCase(String category);
    List<LibraryEntity> findByAvailability(boolean availability);
}
