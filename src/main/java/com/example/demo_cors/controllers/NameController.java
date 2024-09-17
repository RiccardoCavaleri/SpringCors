package com.example.demo_cors.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/name")
@CrossOrigin(origins = "*")
public class NameController {

    @GetMapping("/{name}")
    public String getName(@PathVariable String name){
        return "Your name is: " + name;
    }

    @PostMapping("/reverse")
    public String reversedName(@RequestBody String name){
        String reversedName = new StringBuilder(name).reverse().toString();
        return "Reversed name is: " + reversedName;
    }
}
