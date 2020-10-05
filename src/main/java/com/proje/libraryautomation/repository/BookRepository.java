package com.proje.libraryautomation.repository;

import com.proje.libraryautomation.model.Book;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface BookRepository extends JpaRepository<Book, Integer> {

    List<Book> findAllByAuthor(String author);

    List<Book> findAllByGenres(String genres);

    Optional<Book> findBookByName(String name);
}
