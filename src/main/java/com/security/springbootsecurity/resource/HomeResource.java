package com.security.springbootsecurity.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResource {

    @GetMapping("/")
    public String getWelcomePage() {
        return "Welcome!";
    }

    @GetMapping("/user")
    public String getUserPage() {
        return "Welcome user!";
    }

    @GetMapping("/admin")
    public String getAdminPage() {
        return "Welcome admin!";
    }
}
