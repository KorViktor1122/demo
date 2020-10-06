package com.Mymarket.demo.entities;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table
@Data
@NoArgsConstructor
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "customer id")
    private  Customer customer;

    @ManyToOne
    @JoinColumn (name = "product_id")
    private Product product;

    @Column(name = "curentPrice")
    private int currentPrice;
}
