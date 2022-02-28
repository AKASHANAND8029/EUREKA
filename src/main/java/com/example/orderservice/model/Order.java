package com.example.orderservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "order_table")
public class Order {
    @Id
    @Column(name = "order_id")
    private Integer orderId;
    @Column(name = "order_name",nullable = false)
    private String orderName;
    @Column(name = "order_price",nullable = false)
    private Double orderPrice;

}
