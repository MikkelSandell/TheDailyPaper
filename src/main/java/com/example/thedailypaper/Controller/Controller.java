package com.example.thedailypaper.Controller;


import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {


    @GetMapping("/")
public String daliyPaper(){
    return "TheDailyPaper";
}
}
