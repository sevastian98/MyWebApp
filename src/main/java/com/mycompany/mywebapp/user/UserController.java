package com.mycompany.mywebapp.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserService service;

    @GetMapping("/users")
    public String showUserList(Model model) {
        List<User> listUsers = service.listAll();
        model.addAttribute("listUsers",listUsers);
        return "users";
    }

    @GetMapping ("/users/new")
    public String showNewFrom(Model model) {
        model.addAttribute("user", new User());
        return "user_form";

    }

    @PostMapping ("/users/save")
    public String savedUser(User user) {
        service.save(user);
        return "redirect:/users";
    }
}
