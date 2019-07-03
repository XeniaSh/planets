package com.example.planets;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GreetingController {
    @GetMapping("/mercury")
    public void mercury(Model model) {
    }

    @GetMapping("/venus")
    public void venus(Model model) {
    }

    @GetMapping("/earth")
    public String earth(Model model) {
        return "earth";
    }

    @GetMapping("/mars")
    public void mars(Model model) {
    }
}
