package com.robert.portfolio.dto;

public class UserDto {
    private long userId;
    private String username;

    public UserDto() {
        super();
    }

    public UserDto(long userId, String username) {
        this.userId = userId;
        this.username = username;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
