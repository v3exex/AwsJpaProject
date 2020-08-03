package com.jojo.book.springboot.web;

import com.jojo.book.springboot.Annotation.LengthStr;
import com.jojo.book.springboot.web.dto.HelloResponseDto;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    @GetMapping("/hello/dto")
    public HelloResponseDto helloDto(@RequestParam("name") String name, @RequestParam("amount") int amount) {
        return new HelloResponseDto(name, amount);
    }

    @PostMapping("/hello/valid")
    public void helloValid(@RequestBody @Valid HelloResponseDto dto) {
        System.out.println("이름 : " + dto.getName());
    }
}
