package com.bjsasc.demoyy;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class MytestController {
    @RequestMapping("/helloWorld")
    public String helloWorld(){
        return "hello world!";
    }
}
