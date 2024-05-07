package br.com.jornadaMilhas.controller;


import br.com.jornadaMilhas.dto.UserProfileDto;
import br.com.jornadaMilhas.entity.UserProfile;
import br.com.jornadaMilhas.repository.UserRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("depoimentos")
public class UserController {

    @Autowired
    private UserRepository repository;

    @PostMapping
    @Transactional
    public void postComment(@RequestBody @Valid UserProfileDto userProfileDto) {
        repository.save(new UserProfile(userProfileDto));
    }


}
