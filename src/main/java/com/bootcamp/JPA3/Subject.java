package com.bootcamp.JPA3;

import javax.persistence.*;

@Entity
@Table(name="subject")
public class Subject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    public Subject() {
    }

    public Subject(int id, String subjectName, Author author) {
        this.id = id;
        this.subjectName = subjectName;
        this.author = author;
    }

    private String subjectName;

    @ManyToOne
    @JoinColumn(name="author_id")
    private Author author;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }
}
