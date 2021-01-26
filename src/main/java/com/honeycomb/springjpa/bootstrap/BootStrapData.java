package com.honeycomb.springjpa.bootstrap;

import com.honeycomb.springjpa.domain.Author;
import com.honeycomb.springjpa.domain.Book;
import com.honeycomb.springjpa.repositories.AuthorRepository;
import com.honeycomb.springjpa.repositories.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {
    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;

    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Author eric =new Author("Eric","Evans");
        Book ddd = new Book("Domain Driven Design", "123456543");
        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);

        authorRepository.save(eric);
        bookRepository.save(ddd);

        Author rod = new Author("Rod", "Johnson");
        Book noEJB = new Book("J2EE Development eithout EJB", "8934893263");
        rod.getBooks().add(noEJB);
        noEJB.getAuthors().add(rod);

        authorRepository.save(rod);
        bookRepository.save(noEJB);

        System.out.println("started in Bootstrap");
        System.out.println("Number os Books: " + bookRepository.count());

    }
}
