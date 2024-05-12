package com.robert.portfolio.dto;

import jakarta.persistence.*;

@Entity
@Table(name="tblUser")
public class UserDto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer userId;
    private String username;

    public UserDto() {
        super();
    }

    public UserDto(String username) {
        this.username = username;
    }

    public Integer getId() {
        return userId;
    }

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
}
