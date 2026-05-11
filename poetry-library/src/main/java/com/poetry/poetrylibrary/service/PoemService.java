package com.poetry.poetrylibrary.service;

import com.poetry.poetrylibrary.entity.Poem;
import com.poetry.poetrylibrary.repository.PoemRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Locale;
import java.util.Optional;

@Service
public class PoemService {
    private final PoemRepository repository;

    PoemService(PoemRepository repository) {
        this.repository = repository;
    }

    public List<Poem> findAll(){
        return repository.findAll();
    }

    public Optional<Poem> findById(Long id){
        return repository.findById(id);
    }

    public List<Poem> findByAuthor(String author){
        return repository.findByAuthorContainingIgnoreCase(author.toLowerCase(Locale.ROOT));
    }

    public List<Poem> findByDate(LocalDate date){
        return repository.findByDate(date);
    }

    public List<Poem> findByTitle(String title){
        return repository.findByTitle(title);
    }

    public Poem save (Poem poem) {
        return repository.save(poem);
    }

    public void deleteById(Long id) {
        if (!repository.existsById(id)){
            throw new RuntimeException("Произведения с id = " + id + " не существует");
        }
        repository.deleteById(id);
    }

    public void deleteByTitle(String title) {
        if (!repository.existsByTitle(title)){
           throw new RuntimeException("Произведения с названием '" + title + "' не существует");
        }
        repository.deleteByTitle(title);
    }

    public void deleteByDate(LocalDate date){
        if (!repository.existsByDate(date)){
            throw new RuntimeException("Произведения с датой написания " + date + " не существует");
        }
        repository.deleteByDate(date);
    }

    public void deleteByAuthor(String author){
        if (!repository.existsByAuthor(author)){
            throw new RuntimeException("Произведения с автором " + author + " не существует");
        }
        repository.deleteByAuthor(author);
    }

    public void deleteAll(){
        repository.deleteAll();
    }
}
