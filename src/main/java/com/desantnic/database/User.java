package com.desantnic.database;

public class User {
    private int id;
    private String username;
    private String password;

    public User() {
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public User(int id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public int getId(int anInt) {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername(String string) {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword(String string) {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

//    @Override
//    public String toString() {
//        return getClass().getSimpleName() + "{id: " + id
//                + ", username: " + username
//                + ". password: " + password
//                + "}";
//    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

