package com.example.blogging.Controllers;


import com.example.blogging.models.User;
import com.example.blogging.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path = "/demo")
public class UserController {


    @Autowired
    private UserRepository userRepository;


    @PostMapping(path = "/add")
    public @ResponseBody String addNewUser(@RequestParam String firstName,@RequestParam String lastName,@RequestParam String email,@RequestParam String password){

        User n=new User();
        n.setMail(email);
        n.setFirstName(firstName);
        n.setLastName(lastName);
        n.setPassword(password);
        return "Saved";
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<User> getAllUsers(){
        return userRepository.findAll();
    }


}
