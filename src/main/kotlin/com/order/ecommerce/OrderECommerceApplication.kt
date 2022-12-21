package com.order.ecommerce

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
@ComponentScan("com.order.ecommerce")
open class OrderECommerceApplication

fun main(args: Array<String>) {
    runApplication<OrderECommerceApplication>(*args)
}
