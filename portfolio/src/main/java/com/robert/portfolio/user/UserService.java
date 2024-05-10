package com.robert.portfolio.user;

import com.robert.portfolio.dto.UserDto;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    public UserDto getUser(long id) {
        return new UserDto(1, "Rmalloy");
    }

    public UserDto postUser(UserDto userDto) {
        return new UserDto(userDto.getUserId(), userDto.getUsername());
    }
}
