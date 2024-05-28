package com.spring.keycloak.controller;

import com.spring.keycloak.model.Customer;
import com.spring.keycloak.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class LoginController {
    private final CustomerRepository customerRepository;
    @RequestMapping("/user")
    public Customer getUserDetailsAfterLogin(Authentication authentication) {
       return customerRepository.findByEmail(authentication.getName())
               .stream()
               .findFirst()
               .orElse(null);
    }

}
