package com.pix.chavepix.controller;

import com.pix.chavepix.domain.Users;
import com.pix.chavepix.service.Interface.UsersInterface;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
@RequestMapping("/user")
public class UserController {

    private final UsersInterface usersInterface;

    @RequestMapping(method = RequestMethod.POST)
    public Users salvar(@RequestBody @Valid Users users) {
        return usersInterface.salvar(users);
    }

}
