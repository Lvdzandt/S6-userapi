package com.example.fhict;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {

    private final IUserRepo repo;

    public UserController(IUserRepo repo){
        this.repo = repo;
    }

    @CrossOrigin(origins = "http://localhost:8083")
    @PostMapping("/")
    public User postUSer(@RequestBody User user){
        return repo.save(user);
    }

    @CrossOrigin(origins = "http://localhost:8083")
    @GetMapping("/")
    public List<User> all(){
        return repo.findAll();
    }


    @CrossOrigin(origins = "http://localhost:8083")
    @GetMapping("/hw")
    public String hw(){
        return "hello world";
    }
}
