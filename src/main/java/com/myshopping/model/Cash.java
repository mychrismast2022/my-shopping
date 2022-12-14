package com.myshopping.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@Getter
@Setter
@Entity
@Table
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Cash extends Payment {
    @Column(name = "cash_tendered")
    private BigDecimal cashTendered;
}
