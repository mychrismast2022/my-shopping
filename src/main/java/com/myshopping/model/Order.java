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
@Table(name = "orders")
public class Order {

    @Id
    private Long id;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;

    @ManyToOne
    @JoinColumn(name = "shipper_id")
    private Shipper shipper;

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
}
