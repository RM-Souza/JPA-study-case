package com.example.jpaproject.repositories;

import com.example.jpaproject.entities.Order;
import com.example.jpaproject.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
