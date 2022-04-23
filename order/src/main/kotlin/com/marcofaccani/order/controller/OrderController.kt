package com.marcofaccani.order.controller

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/order")
class OrderController(@Value("\${server.port}") val port: String) {

    @GetMapping("/info")
    fun showOrderInfo(): ResponseEntity<String> {
        return ResponseEntity.ok("FROM ORDER SERVICE, Port# is: $port")
    }

}