package kz.bitlab.Sprint2.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ListController {

    @GetMapping(value = "/list")
    public String showList(Model model){

        return "list";
    }
}
