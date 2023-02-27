package com.boot.template.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Slf4j
@Controller
public class StartController {

    @GetMapping("index")
    public String index() {
        log.info("test...");
        return "index";
    }
}