package com.tradlyf.tradlyf.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class users {
    @Id
    @GeneratedValue
    private long Id;

    private String email;
    private String password;

    private int result;

    public users() {
    }

    public users(long id, String email, String password, int result) {
        Id = id;
        this.email = email;
        this.password = password;
        this.result = result;
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "users{" +
                "Id=" + Id +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", result=" + result +
                '}';
    }
}
