package com.example.demo;

import org.slf4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controller {

    private static final Logger log = org.slf4j.LoggerFactory.getLogger(Controller.class);

    @GetMapping
    public void logTestMessage() {
    	System.out.println("ERROR LOG");
        log.info("ERROR");
    }
}