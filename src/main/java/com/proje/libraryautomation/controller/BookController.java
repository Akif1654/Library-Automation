package com.proje.libraryautomation.controller;

import com.proje.libraryautomation.model.Book;
import com.proje.libraryautomation.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Books")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping
    public Page<Book> getAll(Book book){return bookService.getAll(book);}

    @GetMapping("/{id}")
    public Optional<Book> getOneById(@PathVariable Integer id){return bookService.getOneById(id);}

    @GetMapping("/{name}")
    public Optional<Book> getOneByName(@PathVariable String name){return bookService.getOneByName(name);}

    @GetMapping("/{author}")
    public List<Book> getAllByAuthor(@PathVariable String author){return bookService.getAllByAuthor(author);}

    @GetMapping("/{genres}")
    public List<Book> getAllByGenres(@PathVariable String genres){return bookService.getAllByGenres(genres);}

    @PostMapping
    public void add(Book book){bookService.add(book);}

    @PutMapping
    public void update(Book book){bookService.update(book);}

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id){bookService.delete(id);}

}
