package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

    @GetMapping({"/", "/index"})
    public String index() {
        return "index";
    }

    @GetMapping("/cv")
    public String cv() {
        return "cv";
    }

    @GetMapping("/about")
    public String about() {
        return "about";
    }

    @GetMapping("/notes")
    public String notes() {
        return "notes";
    }

    @GetMapping("/notes/deploy-aliyun")
    public String deployAliyun() {
        return "deploy-aliyun";
    }
}
