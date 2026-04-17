package ru.netology.rest.repository;

import ru.netology.rest.model.Authorities;

import java.util.List;

public class User {
    private String username;
    private String password;
    private List<Authorities> authorities;

    public User(String username, String password, List<Authorities> authorities) {
        this.username = username;
        this.password = password;
        this.authorities = authorities;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public List<Authorities> getAuthorities() {
        return authorities;
    }

}
