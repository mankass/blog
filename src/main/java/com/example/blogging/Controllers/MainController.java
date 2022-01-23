package com.example.blogging.Controllers;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Collections;
import java.util.Map;

@Controller
public class MainController {

    @GetMapping("/")
    public String greeting(Model model) {
        model.addAttribute("name", "Main page denok");
        return "home";
    }

    @GetMapping("/about")
    public String about(Model model) {
        model.addAttribute("name", "about denok");
        return "about";
    }

    @GetMapping("/FAQs")
    public String FAQs(Model model) {
        model.addAttribute("name", "about denok");
        return "FAQs";
    }

    @GetMapping("/ Pricing")
    public String Pricing() {
        return " Pricing";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/terms")
    public String terms(Model model) {
        model.addAttribute("name", "about denok");
        return "terms";
    }


}