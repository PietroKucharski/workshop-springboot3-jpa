package com.pietrokucharski.spring_project.resources;

import com.pietrokucharski.spring_project.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResources {

    @GetMapping
    public ResponseEntity<User> findAll() {
        User user = new User(1L, "Pietro", "pietro@email.com", "123456789", "1234");
        return ResponseEntity.ok().body(user);
    }
}
