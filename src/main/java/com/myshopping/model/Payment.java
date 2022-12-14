package com.myshopping.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "payment", indexes = {@Index(name = "uniqueAmount", columnList = "amount", unique = true)})
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "amount")
    private BigDecimal amount;

    /* WireTransfer */

    @Column(name = "bank_name")
    private String bankName;


    @Column(name = "bank_id")
    private String bankId;

    /* Credit */

    @Column(name = "credit_number")
    private String creditNumber;

    @Column(name = "type")
    private String type;

    @Column(name = "expire_date")
    private LocalDate expireDate;

    /* Cash */
    @Column(name = "cash_tendered")
    private BigDecimal cashTendered;

}
