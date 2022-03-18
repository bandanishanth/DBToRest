package com.bandanishanth.dbrestapp.controller;

import com.bandanishanth.dbrestapp.entity.Hello;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class DefaultController {
    @GetMapping
    public Hello hello()
    {
        return new Hello();
    }
}
