package com.hackthon.order2.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class Order {
    //this is an order
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    String orderId;
    String userId;
    String total_amount;
    String paymentStatus;
    LocalDate created_at;
    String order_item_id;
    String product_id;
    String quantity;
    String price;
}
