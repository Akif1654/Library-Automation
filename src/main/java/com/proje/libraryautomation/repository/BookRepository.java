package com.proje.libraryautomation.repository;

import com.proje.libraryautomation.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Integer> {

    List<Book> findAllByAuthor(String author);

    List<Book> findAllByGenres(String genres);

    List<Book> findAllByName(String name);

    List<Book> findAllByPublisher(String publisher);

}
