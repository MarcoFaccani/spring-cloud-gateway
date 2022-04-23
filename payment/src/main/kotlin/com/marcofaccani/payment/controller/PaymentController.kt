package com.marcofaccani.payment.controller

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment")
class PaymentController(@Value("\${server.port}") val port: String) {

    @GetMapping("/info")
    fun showPaymentInfo(): ResponseEntity<String> {
        return ResponseEntity.ok("FROM PAYMENT SERVICE, Port# is: $port")
    }

}