package com.order.ecommerce.model

import lombok.Data
import java.io.Serializable
import javax.persistence.Column
import javax.persistence.Embeddable

@Embeddable
@Data
class OrderItemPk(

    @Column(name = "product_id", nullable = false)
    private var productId: String,

    @Column(name = "order_id", nullable = false)
    private var orderId: String

) : Serializable {
    companion object {
        private const val serialVersionUID = 5074947294298476737L
    }
}
