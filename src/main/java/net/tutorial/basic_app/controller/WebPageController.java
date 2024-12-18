package net.tutorial.basic_app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class WebPageController {


    @GetMapping("/greeting")
    public String sayHi(){
        return "hi.html";
    }

}
