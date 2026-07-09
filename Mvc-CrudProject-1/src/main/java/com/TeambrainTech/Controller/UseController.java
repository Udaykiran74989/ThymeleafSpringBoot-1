package com.TeambrainTech.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.TeambrainTech.Entity.Users;
import com.TeambrainTech.Service.Service;

@Controller
public class UseController {

    @Autowired
    private Service service;

    
    @GetMapping("/")
    public String homePage() {
        return "home";
    }

    @GetMapping("/register")
    public String registerPage(Model model) {
        model.addAttribute("user", new Users());
        return "register";
    }

   
    @PostMapping("/save")
    public String saveUser(@ModelAttribute Users user) {
        service.saveUser(user);
        return "redirect:/allusers";
    }

    
    @GetMapping("/allusers")
    public String showUsers(Model model) {

        List<Users> list = service.getAllUsers();

        model.addAttribute("userlist", list);

        return "viewall";
    }



    @GetMapping("/delete/{id}")
    public String deleteUser(@PathVariable long id) {

        service.deleteUsers(id);

        return "redirect:/allusers";
    }

    
    
    @GetMapping("/edituser/{id}")
    public String editUser(@PathVariable long id, Model model) {

        Users user = service.getUserById(id);

        model.addAttribute("user", user);

        return "edit";
    }

   
    @PostMapping("/update")
    public String updateUser(@ModelAttribute Users user) {

        service.saveUser(user);

        return "redirect:/allusers";
    }
}