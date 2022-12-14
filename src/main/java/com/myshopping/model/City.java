package com.myshopping.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "city")
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "district_name")
    private String districtName;

    @OneToMany(mappedBy = "city", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<District> districts;

    @ManyToOne
    @JoinColumn(name = "province_id")
    private Province province;

    @OneToOne(mappedBy = "city", cascade = CascadeType.ALL)
    private Address address;
}
