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


    @CrossOrigin(origins = {"http://localhost:8083","http://localhost:8080"})
    @PostMapping("/")
    public User postUser(@RequestBody User user){
        return repo.save(user);
    }

    @CrossOrigin(origins = {"http://localhost:8083","http://localhost:9080","http://localhost:8080"})
    @GetMapping("/{id}")
    public ResponseEntity<User> getUserById(@PathVariable(value = "id") int id){
        User result = repo.findUserById(id);
        return ResponseEntity.ok(result);
    }

    @CrossOrigin(origins = {"http://localhost:8083","http://localhost:9080","http://localhost:8080"})
    @DeleteMapping({"/{id}"})
    public ResponseEntity<String> deleteUserById(@PathVariable(value = "id")int id){
        User deleted = repo.findUserById(id);
        repo.delete(deleted);
        return ResponseEntity.ok("deleted");
    }
}
