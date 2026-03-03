package com.example.docker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "hello docker version 2";
    }

  @GetMapping("/frontend")
   public String frontend() {
       return "Frontend details pages update1";
       //return "Frontend details pages update";
   }
}


