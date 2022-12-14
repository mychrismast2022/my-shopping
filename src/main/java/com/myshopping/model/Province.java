package com.myshopping.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "city", indexes = @Index(name = "uniqueProvinceName", columnList = "province_name", unique = true))
public class Province {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "province_name")
    private String provinceName;

    @OneToMany(mappedBy = "province", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<City> cities;

    @OneToOne(mappedBy = "province", cascade = CascadeType.ALL)
    private Address address;
}
