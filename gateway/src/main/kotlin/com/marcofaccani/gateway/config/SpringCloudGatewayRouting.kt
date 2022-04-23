package com.marcofaccani.gateway.config

import org.springframework.cloud.gateway.route.RouteLocator
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class SpringCloudGatewayRouting {

    @Bean
    fun configureRoutes(builder: RouteLocatorBuilder): RouteLocator {
        return builder.routes()
            .route("paymentId") { r -> r.path("api/v1/payment/**").uri("http://localhost:9009") } //static routing
            .route("orderId") { r -> r.path("api/v1/order/**").uri("lb://ORDER-SERVICE") } //dynamic routing
            .build()
    }

}