package com.myshopping.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class WireTransfer extends Payment {

    @Column(name = "bank_id")
    private String bankId;

    @Column(name = "name")
    private String name;
}
