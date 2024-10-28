package com.projet.Detectify.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String redirectToUsers() {
        return "redirect:/api/users";
    }
}
