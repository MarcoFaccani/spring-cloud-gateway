package com.marcofaccani.spring

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MygatewayApplication

fun main(args: Array<String>) {
    runApplication<MygatewayApplication>(*args)
}
