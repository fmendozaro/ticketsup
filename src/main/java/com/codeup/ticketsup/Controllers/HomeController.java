package com.codeup.ticketsup.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
@Controller
public class HomeController {


    @GetMapping("/")
    public String home() {

        return "index";
    }
}
