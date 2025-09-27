package com.scalercourse.productservice.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sample")
public class SampleController {

    @GetMapping("/hello/{name}/{times}")
    public String sayHello(@PathVariable("name") String name, @PathVariable int times) {
        String result ="";

        for(int i=0;i<times;i++){
            result += "hello"+name +"<br>";
        }
        return result;
    }

    @GetMapping("/sayhi")
    public String sayHi(){
        return "Hi";
    }

}
