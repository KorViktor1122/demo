package com.Mymarket.demo.services;


import com.Mymarket.demo.entities.Order;
import com.Mymarket.demo.repositories.OrderRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class OrderService {

    private OrderRepository orderRepository;

    public List<Order> findAll() {
        return orderRepository.findAll();
    }


}
