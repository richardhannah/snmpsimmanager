package com.richard.snmpsimmanager.web.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * FooResource controller
 */
@RestController
@RequestMapping("/api/foo")
public class FooResource {

    private final Logger log = LoggerFactory.getLogger(FooResource.class);

    /**
    * GET hello
    */
    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

}
