package info.rue.example.exam01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/exam01")
public class Exam01Controller {

    @RequestMapping("/getMessage")
    public String getHelloWorld(Model model) {

        model.addAttribute("message", "Hello World");

        return "/exam01/getMessage";
    }
}
