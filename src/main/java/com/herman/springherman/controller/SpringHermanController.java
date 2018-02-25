package com.herman.springherman.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/springherman")
public class SpringHermanController {

    @RequestMapping(value = "sayHello", method = RequestMethod.GET)
    public String sayHello(){
        return "hello, this si my first spring boot program!!!";
    }
}
