package com.bootcamp.JPA3;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="book")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    private String bookName;

    //ONE TO ONE
//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name="author_id")
//    private Author author;

    //MANY TO ONE
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="author_id")
    private Author author;

    //MANY TO MANY
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="author_id")
    private List<Author> authors;


    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
}
