package com.projet.projetse352.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Main {
    @RequestMapping("/")
    public String index() {
        return "Main";
    }
}
