package com.myshopping.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "orders", indexes = {
        @Index(name = "uniqueOrderDate", columnList = "order_date", unique = true),
        @Index(name = "uniqueShippedDate", columnList = "shipped_date", unique = true),
        @Index(name = "uniqueRequiredDate", columnList = "required_date", unique = true)
})
public class Order {

    @Id
    private Long id;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private User customer;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private User employee;

    @ManyToOne
    @JoinColumn(name = "shipper_id")
    private User shipper;

    @OneToMany(mappedBy = "order", fetch = FetchType.LAZY)
    private Set<OrderDetail> orderDetails;

    @Column(name = "order_date")
    private LocalDate orderDate;

    @Column(name = "shipped_date")
    private LocalDate shippedDate;

    @Column(name = "status")
    private boolean status;

    @Column(name = "tax")
    private BigDecimal tax;

    @Column(name = "required_date")
    private LocalDate requiredDate;

    @ManyToOne
    @JoinColumn(name = "address_id")
    private Address address;

    @ManyToMany
    @JoinTable(
            name = "order_payments",
            joinColumns = {@JoinColumn(name = "order_id")},
            inverseJoinColumns = {@JoinColumn(name = "payment_id")}
    )
    private Set<Payment> payments;
}
