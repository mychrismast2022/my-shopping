package com.myshopping.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "shippers")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Shipper extends User {

    @Column(name = "number_of_orders")
    private int numberOfOrders;

    @Column(name = "salary")
    private BigDecimal salary;

    @OneToMany(mappedBy = "shipper", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Order> orders;
}
