package com.poetry.poetrylibrary.controller;

import com.poetry.poetrylibrary.entity.Poem;
import com.poetry.poetrylibrary.service.PoemService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/poems")
public class PoemController {
    private final PoemService poemService;

    public PoemController(PoemService poemService) {
        this.poemService = poemService;
    }

    @GetMapping
    public List<Poem> findAll(){
        return poemService.findAll();
    }

    @GetMapping("/search")
    public List<Poem> search(
            @RequestParam(required = false) String title,
            @RequestParam(required = false) String author,
            @RequestParam(required = false) LocalDate date
    ) {
        if (title != null) {
            return poemService.findByTitle(title);
        }
        if (author != null) {
            return poemService.findByAuthor(author);
        }
        if (date != null) {
            return poemService.findByDate(date);
        }
        return poemService.findAll();
    }

    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public Poem save (@RequestBody Poem poem) {
        return poemService.save(poem);
    }

    @DeleteMapping("/by-title")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteByTitle(@RequestParam String title) {
        poemService.deleteByTitle(title);
    }

    @DeleteMapping("/by-author")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteByAuthor(@RequestParam String author) {
        poemService.deleteByAuthor(author);
    }

    @DeleteMapping("/by-date")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteByDate(@RequestParam LocalDate date) {
        poemService.deleteByDate(date);
    }

    @DeleteMapping("/all")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteAll(){
        poemService.deleteAll();
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteById(@PathVariable Long id) {
        poemService.deleteById(id);
    }

    @GetMapping("/{id}")
    public Poem findById(@PathVariable Long id) {
        return poemService.findById(id)
                .orElseThrow(() -> new ResponseStatusException(
                        HttpStatus.NOT_FOUND,
                        "Произведения с id = " + id + " не существует"
                ));
    }
}
