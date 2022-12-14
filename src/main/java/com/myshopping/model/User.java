package com.myshopping.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Set;


@Getter
@Setter
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "middle_name")
    private String middleName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "birthday")
    private LocalDate birthday;

    @Column(name = "email")
    private String email;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "photo")
    private String photo;

    @Column(name = "birth_date")
    private LocalDate birthDate;

    @Column(name = "sex")
    private String sex;

    @Column(name = "is_active")
    private boolean isActive;

    @Column(name = "height")
    private BigDecimal height;

    @Column(name = "favorite")
    private String favorite;

    @Column(name = "weight")
    private BigDecimal weight;

    @Column(name = "width")
    private BigDecimal  width;

    @Column(name = "position")
    private String position;

    @Column(name = "number_of_working_days")
    private int numberOfWorkingDays;

    @Column(name = "salary")
    private BigDecimal salary;

    @Column(name = "seniority")
    private int seniority;

    @Column(name = "number_of_orders")
    private int numberOfOrders;

    @ManyToMany
    @JoinTable(
            name = "users_roles",
            joinColumns = {@JoinColumn(name = "user_id")},
            inverseJoinColumns = {@JoinColumn(name = "role_id")}
    )
    private Set<Role> roles;

    @OneToMany(mappedBy = "shipper", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Order> orders;

}
