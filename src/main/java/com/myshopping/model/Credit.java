package com.myshopping.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Credit extends Payment {
    @Column(name = "credit_number")
    private String creditNumber;

    @Column(name = "type")
    private String type;

    @Column(name = "expire_date")
    private LocalDate expireDate;

}
