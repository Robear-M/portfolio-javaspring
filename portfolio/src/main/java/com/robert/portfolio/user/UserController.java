package com.robert.portfolio.user;

import com.robert.portfolio.dto.UserDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;

@RestController
@RequestMapping("/v1/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/info")
    public ResponseEntity<UserDto> getUserInfo(
            @RequestParam(value = "", defaultValue = "1") long id) {
            return ResponseEntity.ok(userService.getUser(id));
    }

    @PostMapping("/update")
    public ResponseEntity<UserDto> postUser(@RequestBody UserDto userDto) {
        return ResponseEntity.created(URI.create("/v1/user/update")).body(userService.postUser(new UserDto(2, "rmalloy1")));
    }
}
