package com.myshopping.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@Getter
@Setter
@Data
@Entity
@Table(name = "customers")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Customer extends User {

    @Column(name = "favorite")
    private String favorite;

    @Column(name = "height")
    private BigDecimal height;

    @Column(name = "weight")
    private BigDecimal weight;
}
