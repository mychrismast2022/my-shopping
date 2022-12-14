package com.myshopping.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "suppliers")
public class Supplier {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "contact_name")
    private String contactName;

    @Column(name = "phone_number")
    private String phoneNumber;

    @OneToMany(mappedBy = "supplier", cascade = CascadeType.ALL)
    private Set<Product> products;
}
