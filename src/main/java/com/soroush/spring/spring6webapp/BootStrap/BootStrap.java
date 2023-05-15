package com.soroush.spring.spring6webapp.BootStrap;

import com.soroush.spring.spring6webapp.Repositories.AuthorRepositories;
import com.soroush.spring.spring6webapp.Repositories.BookRepositories;
import com.soroush.spring.spring6webapp.domain.Author;
import com.soroush.spring.spring6webapp.domain.Book;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrap implements CommandLineRunner {

    private final AuthorRepositories authorRepositories;
    private final BookRepositories bookRepositories;

    public BootStrap(AuthorRepositories authorREpositories, BookRepositories bookRepositories) {
        this.authorRepositories = authorREpositories;
        this.bookRepositories = bookRepositories;
    }

    @Override
    public void run(String... args) throws Exception {
        Author soroush = new Author();
        soroush.setName("Soroush");
        soroush.setFamily("Rezaei");

        Book ddd = new Book();
        ddd.setName("ddd");
        ddd.setIsbn("123456");

        Author roozbe = new Author();
        roozbe.setName("Roozbe");
        roozbe.setFamily("Rezaei");

        Book eee = new Book();
        ddd.setName("eee");
        ddd.setIsbn("456789");

        Author soroushSaved = authorRepositories.save(soroush);
        Book dddSaved = bookRepositories.save(ddd);

        Author roozbeSaved = authorRepositories.save(roozbe);
        Book eeeSaved = bookRepositories.save(eee);

        soroushSaved.getBooks().add(dddSaved);
        roozbeSaved.getBooks().add(eeeSaved);

        System.out.println(" IN BootStrap");
        System.out.println("Author count: "+ authorRepositories.count());
        System.out.println("Book count: "+ bookRepositories.count());

    }

}

























