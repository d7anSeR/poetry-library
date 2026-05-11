package com.poetry.poetrylibrary.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "poems")
public class Poem {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private LocalDate date;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String author;

    public Poem(){}

    public Poem(Long id, LocalDate date, String title, String author) {
        this.id = id;
        this.date = date;
        this.title = title;
        this.author = author;
    }

    public Long getId() {
        return id;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
