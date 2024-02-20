package com.example.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@jakarta.persistence.Entity // This tells Hibernate to make a table out of this class
public class Book {
    @jakarta.persistence.Id
    @jakarta.persistence.GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY) // Auto-increment ID
    private Long id;

    private String name;
    private String pdfUrl; // URL to the online PDF

    // No-args constructor
    public Book() {
    }

    // All-args constructor
    public Book(String name, String pdfUrl) {
        this.name = name;
        this.pdfUrl = pdfUrl;
    }

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPdfUrl() {
        return pdfUrl;
    }

    public void setPdfUrl(String pdfUrl) {
        this.pdfUrl = pdfUrl;
    }

    // toString method for debugging
    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pdfUrl='" + pdfUrl + '\'' +
                '}';
    }
}

