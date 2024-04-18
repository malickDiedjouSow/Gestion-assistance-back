package com.example.projetGLA.restcontroller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.projetGLA.modele.User;
import com.example.projetGLA.service.UserService;


@RestController
@RequestMapping("/GA/users")

public class UserRestcontoller {

    @Autowired

    private UserService userService;

    @GetMapping(path = "/")
    public List<User> lister_user(){
        return userService.lister_User();
    
    }
    
    @GetMapping(path = "/{id}")
    public User rechercher_user(@PathVariable Long id){
        return userService.rechercher_User(id);
    }


    @PostMapping(path="/")
    public User ajouter_user(@RequestBody User user){
        return  userService.ajouter_User(user);
    }

    @PutMapping(path = "/{id}")
    public User modifier_user (@RequestBody User user , @PathVariable Long id){
        return  userService.modifier_User(user, id);

    }

    @DeleteMapping(path = "/{id}")
    public void supprimer_user(@PathVariable Long id){
        userService.supprimer_User(id);
    }

    
}
