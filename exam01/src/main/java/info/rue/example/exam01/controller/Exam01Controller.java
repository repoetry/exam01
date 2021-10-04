package info.rue.example.exam01.controller;

import info.rue.example.exam01.service.Exam01Service;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/exam01")
@AllArgsConstructor
public class Exam01Controller {

    Exam01Service exam01Service;

    @RequestMapping("/getMessage")
    public String getHelloWorld(Model model) {

        model.addAttribute("message", "Hello World");

        return "/exam01/getMessage";
    }

    @RequestMapping("/getCurrentDateTime")
    public String getCurrentDate(Model model) {

        model.addAttribute("message", "Hello World ::: " + exam01Service.getCurrentDateTime());

        return "/exam01/getMessage";
    }
}
