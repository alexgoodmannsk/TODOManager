package ru.alexgoodman.todomanager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class AppController {

    //Точка входа в наше веб-приложение
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String generalPage() {
        return "/hello";
    }
}
