package com.example.application;

import javax.persistence.*;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(nullable=false, unique = true)
    private String title;

    @Column(nullable = false)
    private String author;

    @Column(nullable = false)
    private int year;

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
