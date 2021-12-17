package br.com.marcos.apirest.controllers

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("api/hello")
class classController {

    @GetMapping
    fun handle(): String {
        return "Hello"
    }

}