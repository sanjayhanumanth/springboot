package com.example.postresql.controller;

import com.example.postresql.entity.Users;
import com.example.postresql.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class UsersController {

    @Autowired
    private UsersRepository repository;

    @PostMapping("/save")
    public Users save(@RequestBody Users entity) {
        return repository.save(entity);
    }
    @GetMapping("/user/{id}")
    public Users getUserById(@PathVariable Long id) {
        return repository.findById(id).orElse(null);
    }

}
