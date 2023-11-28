package com.parking.parkinglot.common;

public class UserDto {
    String username;
    String email;
    int id;
    public UserDto(String username, String email, int id) {
        this.username = username;
        this.email = email;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }
}
