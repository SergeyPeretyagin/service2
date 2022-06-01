package serg.example.demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/three")
public class Serv3Controller {

    @GetMapping("/hello3")
    public String hello3(){
        return "Hello3 from service3";
    }

    @GetMapping("hello4")
    public String hello4(@RequestParam int amount){
        return "Hello4 from service3 "+amount;
    }

    @GetMapping
    public String hello5(){
        return "Hello5 from service3";
    }

    @PostMapping
    public String hello6(){
        return "Hello6 from service6";
    }
}
