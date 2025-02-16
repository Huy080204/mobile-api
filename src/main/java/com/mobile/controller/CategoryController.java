package com.mobile.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/category")
public class CategoryController {

    @GetMapping(path = "/hello")
    public String hello() {
        return "Hello World";
    }

}
