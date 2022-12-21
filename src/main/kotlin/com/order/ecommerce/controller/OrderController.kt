package com.order.ecommerce.controller

import com.order.ecommerce.dto.OrderCreateResponse
import com.order.ecommerce.dto.OrderDto
import com.order.ecommerce.model.Order
import com.order.ecommerce.service.OrderService
import io.swagger.v3.oas.annotations.Operation
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/v1")
class OrderController(val orderService: OrderService) {

    @PostMapping("/orders")
    @Operation(summary = "Create an order", description = "Create an order")
    fun createOrder(@RequestBody orderDto: OrderDto): OrderCreateResponse {
        return orderService.createOrder(orderDto)
    }

    @GetMapping("/orders/{orderId}")
    fun findOrderById(@PathVariable(name = "orderId") orderId: String): Order {
        val findOrderById: Order = orderService.findOrderById(orderId)
        return findOrderById
    }

    @PatchMapping("/orders/{orderId}")
    fun updateOrderStatus(
        @PathVariable("orderId") orderId: String,
        @RequestParam(name = "orderStatus") orderStatus: String
    ) {
        orderService.updateOrderStatus(orderId, orderStatus)
    }
}
