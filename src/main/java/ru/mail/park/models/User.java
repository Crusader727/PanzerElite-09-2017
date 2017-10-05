package ru.mail.park.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class User {
    private long id;
    private String login;
    private String password;

    public User() {

    }

    @JsonCreator
    public User(
            @JsonProperty("id") long id,
            @JsonProperty("login") String login,
            @JsonProperty("password") String password
    ) {
        this.id = id;
        this.login = login;
        this.password = password;
    }

    public Object getUser() {
        return this;
    }

    public long getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
