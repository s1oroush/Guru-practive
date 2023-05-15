package com.soroush.spring.spring6webapp.domain;


import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Getter
@Setter
@ToString
@EqualsAndHashCode(exclude = {"id", "authors"})
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String isbn;

    @ManyToMany
    @JoinTable (name = "author book", joinColumns = @JoinColumn(name = "book id"),
            inverseJoinColumns = @JoinColumn(name = "authors id"))
    private Set<Author> authors=new HashSet<>();

}





















