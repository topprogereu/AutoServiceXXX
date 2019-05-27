package com.parser.program.pasha.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @RequestMapping(value="/")
    public String showStartPage()
    {

          return "index";
    }

    @RequestMapping(value="/start_menu")
    public String showMainMenuIfUserEntrys()
    {
        return "menu";
    }


}
