package me.whiteship.springinit.user;

import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @GetMapping("/users/hello")
    public String hello(){
        return "hello";
    }

    @PostMapping("/users/create")
    public User create(@RequestBody User user){
        return user;
    }
}
