package com.parser.program.pasha.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
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
        System.out.println("Suda");
        return "menu";
    }


    @RequestMapping(value="/parse_autoria")
    @ResponseBody
    public String startedParseAutoria()
    {

        return "Hi";
    }

    @RequestMapping(value="/parse_rst")
    @ResponseBody
    public String startedParseRst()
    {
        return "Hi";
    }


}
