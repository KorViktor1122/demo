package com.Mymarket.demo.repositories;


import com.Mymarket.demo.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
    @Query("select o from Order o where o.custover.id = ?1")
    List<Order> findAllByCustomerId(Long customerId);
}
