package com.bootcamp.JPA3;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="author")
public class AuthorOneToMAny {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int age;
    private String name;

    //ONE TO MANY
    @OneToMany(mappedBy = "author")
    private List<Subject> subjects;

    // EMBEDDED
    @Embedded
    Address address;

    // ONE AUTHOR TO MANY BOOKS
    @OneToMany(mappedBy = "author")
    private List<Book> books;


    //GETTERS - SETTERS
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }


    public Address getAddress() {
        return address;
    }
    public void setAddress(Address address) {
        this.address = address;
    }


    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}

