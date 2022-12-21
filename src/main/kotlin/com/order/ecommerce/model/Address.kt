package com.order.ecommerce.model

import lombok.Data
import java.io.Serializable
import java.time.LocalDate
import javax.persistence.*

@Entity
@Table(name = "ecommerce_address")
@Data
data class Address(

    @Id
    @Column(name = "address_id", nullable = false, unique = true)
    private var addressId: String,

    @Column(name = "address1", nullable = false)
    private var address1: String,

    @Column(name = "address2", nullable = false)
    private var address2: String,

    @Column(name = "city", nullable = false)
    private var city: String,

    @Column(name = "state", nullable = false)
    private var state: String,

    @Column(name = "zip", nullable = false)
    private var zip: String,

    @Column(name = "email", nullable = false)
    private var email: String,

    @Column(name = "phone", nullable = false)
    private var phone: String,

    @Column(name = "createdAt", nullable = false)
    private var createdAt: LocalDate,

    @OneToOne(fetch = FetchType.LAZY, mappedBy = "billingAddress")
    private var order: Order?

) : Serializable
