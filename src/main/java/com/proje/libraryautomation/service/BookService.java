package com.proje.libraryautomation.service;

import com.proje.libraryautomation.model.Book;
import com.proje.libraryautomation.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public Page<Book> getAll(Book book){return bookRepository.findAll(PageRequest.of(0,20));}

    public Optional<Book> getOneById(Integer id){ return bookRepository.findById(id);}

    public Optional<Book> getOneByName(String name){ return bookRepository.findBookByName(name);}

    public List<Book> getAllByAuthor(String author){ return bookRepository.findAllByAuthor(author);}

    public List<Book> getAllByGenres(String genres){ return bookRepository.findAllByGenres(genres);}

    public void add(Book book){bookRepository.save(book);}

    public void update(Book book){bookRepository.save(book);}

    public void delete(Integer id){bookRepository.deleteById(id);}
}
