package com.example.fhict;

import org.springframework.http.ResponseEntity;
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
    public User postUser(@RequestBody User user){
        return repo.save(user);
    }

    @CrossOrigin(origins = {"http://localhost:8083","http://localhost:9080"})
    @GetMapping("/{id}")
    public ResponseEntity<User> getUserById(@PathVariable(value = "id") int id){
        User result = repo.findUserById(id);
        return ResponseEntity.ok(result);
    }

    @CrossOrigin(origins = {"http://localhost:8083","http://localhost:9080"})
    @DeleteMapping({"/{id}"})
    public ResponseEntity<User> deleteUserById(@PathVariable(value = "id")int id){
        User deleted = repo.deleteUserById(id);
        return ResponseEntity.ok(deleted);
    }
}
