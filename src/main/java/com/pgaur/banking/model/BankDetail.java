package com.pgaur.banking.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "bank_details")
@Data
public class BankDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "ifsc")
    private String ifsc;

    @Column(name = "bank_id")
    private String bankId;

    @Column(name = "branch")
    private String branch;

    @Column(name = "address")
    private String address;

    @Column(name = "city")
    private String city;

    @Column(name = "district")
    private String district;

    @Column(name = "state")
    private String state;

    @Column(name = "bank_name")
    private String bankName;
}
