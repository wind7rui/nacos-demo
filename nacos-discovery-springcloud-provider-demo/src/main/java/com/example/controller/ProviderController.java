package com.example.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class ProviderController {

    @RequestMapping(value = "/hi/{name}", method = RequestMethod.GET)
    public String sayHi(@PathVariable String name){
        return "hi, " + name;
    }
}
