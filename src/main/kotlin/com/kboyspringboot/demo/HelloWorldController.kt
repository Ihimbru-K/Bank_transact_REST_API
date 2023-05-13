package com.kboyspringboot.demo

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController //Initialize class and make it responsible for rest requests
@RequestMapping("api/hello")  // Defines path to be used by any endpoint in this class

class HelloWorldController {

    @GetMapping // this endpoint is used to fetch data
    fun helloWorld(): String = "Hello world"
}