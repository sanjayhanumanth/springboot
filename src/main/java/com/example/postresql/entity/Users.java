package com.example.postresql.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "users") // Replace with your actual table name
public class Users {

    @Id
    private Long id;

    @Column(name = "name") // use this spelling if it's "neame" in DB
    private String name;

    // Getters and Setters
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
}

