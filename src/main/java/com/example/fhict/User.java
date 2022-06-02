package com.example.fhict;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {
    private @Id @GeneratedValue int id;
    private String name;
    private String password;
    private String description;
    private int profilepicture;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

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
}
