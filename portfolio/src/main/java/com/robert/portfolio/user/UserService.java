package com.robert.portfolio.user;

import com.robert.portfolio.dto.UserDto;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Iterable<UserDto> findAllUsers() {
        return this.userRepository.findAll();
    }

    public UserDto getUser(int id) {
        return this.userRepository.findById(id).get();
    }

    public UserDto postUser(UserDto userDto) {
        return this.userRepository.save(userDto);
    }
}
