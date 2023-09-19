package com.goit.GOITDevHW15_SpringBoot_Security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
    @GetMapping("/test")
    public String testPage() {
        return "test";
    }
}
