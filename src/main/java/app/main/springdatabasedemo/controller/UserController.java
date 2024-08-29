package app.main.springdatabasedemo.controller;

import app.main.springdatabasedemo.dto.request.UserCreationRequest;
import app.main.springdatabasedemo.entity.User;
import app.main.springdatabasedemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/users")
    User createUser(@RequestBody UserCreationRequest request) {
        return userService.createUser(request);
    }

}
