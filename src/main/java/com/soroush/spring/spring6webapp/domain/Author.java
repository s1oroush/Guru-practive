package com.soroush.spring.spring6webapp.domain;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.ManyToAny;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;


@Entity
@Getter
@Setter
@ToString
@EqualsAndHashCode(exclude = {"id","books"})
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String family;

    @ManyToMany(mappedBy = "authors")
    private Set<Book> books= new HashSet<>();

}





















