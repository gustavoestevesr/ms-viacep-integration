package br.com.viacep.viacepservice.view.controller;

import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.viacep.viacepservice.dto.UserDto;
import br.com.viacep.viacepservice.service.UserService;
import br.com.viacep.viacepservice.view.model.UserRequest;

@RequestMapping("/endereco")
@RestController
public class UserController {
    
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/consulta")
    public ResponseEntity consultaCep(@RequestBody @Valid UserDto userDto) {
        UserRequest userRequest = new UserRequest();
        BeanUtils.copyProperties(userDto, userRequest);
        return new ResponseEntity<>(userService.executaRequestViaCep(userRequest), HttpStatus.OK);
    }

}
