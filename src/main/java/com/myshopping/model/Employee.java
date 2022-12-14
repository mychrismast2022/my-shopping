package com.myshopping.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import java.math.BigDecimal;

@Getter
@Setter
@Data
@Entity
@Table(name = "employees")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Employee extends User {
    private String position;

    private BigDecimal salary;

    private int numberOfWorkingDays;

    private int seniority;

}
