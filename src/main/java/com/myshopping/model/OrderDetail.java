package com.myshopping.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "order_details")
public class OrderDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "orderDetail", cascade = CascadeType.ALL)
    private Set<Product> products;


    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;

    private int quantity;

}
