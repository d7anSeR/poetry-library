package com.poetry.poetrylibrary.repository;

import com.poetry.poetrylibrary.entity.Poem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;

public interface PoemRepository extends JpaRepository<Poem, Long> {
    List<Poem> findByAuthorContainingIgnoreCase(String author);
    List<Poem> findByDate(LocalDate date);
    List<Poem> findByTitle(String title);
    boolean existsByAuthor(String author);
    boolean existsByDate(LocalDate date);
    boolean existsByTitle(String title);

    @Modifying
    @Transactional
    void deleteByTitle(String title);

    @Modifying
    @Transactional
    void deleteByDate(LocalDate date);

    @Modifying
    @Transactional
    void deleteByAuthor(String author);

    @Modifying
    @Transactional
    void deleteAll();
}
