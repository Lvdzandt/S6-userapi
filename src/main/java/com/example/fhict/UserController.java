package com.example.fhict;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {

    private final IUserRepo repo;

    public UserController(IUserRepo repo){
        this.repo = repo;
    }

    @PostMapping("/")
    public User postUSer(User user){
        return repo.save(user);
    }

    @GetMapping("/")
    public List<User> all(){
        return repo.findAll();
    }

}
