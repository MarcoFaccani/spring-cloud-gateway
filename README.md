## Overview

This multimodule app showcases how to create a gateway with service discovery using Spring Cloud Gateway and Eureka.

## Manual Testing

Run the services in the following order:

1. eureka

> you can reach the eureka server at http://localhost:8761/ to view which services have been registred

2. order
3. payment
4. gateway

> Consider using the `Spring Service` tab to start the services by going to `View` > `Tool Windows` > `Services`.
> If IntelliJ doesn't automatically detect the projects in such tab, click on the `+` sign > `run configuration type` > `Spring Boot`

Now you can reach the Order and Payment services by calling the gateway (which is running on port 8080)

* http://localhost:8080/order/info
* http://localhost:8080/payment/info

## Running multiple instances of a service using IntelliJ

In the Services tab, right click a service > Edit Configurations > Modify Options > Allow multiple instances