package com.tradlyf.tradlyf.model;

public class users {
    private String email;
    private String password;

    private int result;
    public int getResult() {
        return result;
    }
    public void setResult(int result) {
        this.result = result;
    }

    public users() {
    }

    public users(String email, String password) {
        this.email = email;
        this.password = password;
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

    @Override
    public String toString() {
        return "users{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", result=" + result +
                '}';
    }
}
