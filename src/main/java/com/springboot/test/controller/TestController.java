package com.springboot.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("/test")
@Controller
public class TestController {

    @GetMapping
    public String test(ModelMap map) {
        map.addAttribute("test", List.of());
        return "test/index";
    }

}
