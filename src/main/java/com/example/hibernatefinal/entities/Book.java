package com.example.hibernatefinal.entities;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String bookname;
    @ManyToMany(mappedBy = "bookSet")
    private Set<Author> authors;


    public String getBookName() {
        return bookname;
    }

    public void setBookName(String bookName) {
        this.bookname = bookName;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


}