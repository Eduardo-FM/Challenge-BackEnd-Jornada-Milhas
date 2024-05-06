package br.com.jornadaMilhas.controller;


import br.com.jornadaMilhas.dto.UserProfileDto;
import br.com.jornadaMilhas.entity.UserProfile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("depoimentos")
public class UserController {

    @PostMapping
    public void postComment(@RequestBody UserProfileDto UserProfileDto) {
        System.out.println(UserProfileDto);
    }


}
