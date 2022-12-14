package com.myshopping.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "city", indexes = @Index(name = "uniqueCityName", columnList = "city_name", unique = true))
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "city_name")
    private String cityName;

    @OneToMany(mappedBy = "city", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<District> districts;

    @ManyToOne
    @JoinColumn(name = "province_id")
    private Province province;

    @OneToOne(mappedBy = "city", cascade = CascadeType.ALL)
    private Address address;
}
