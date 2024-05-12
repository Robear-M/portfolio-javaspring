package com.robert.portfolio.user;

import com.robert.portfolio.dto.UserDto;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserDto, Integer> { }
