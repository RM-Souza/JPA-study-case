package com.example.jpaproject.repositories;

import com.example.jpaproject.entities.OrderItem;
import com.example.jpaproject.entities.pk.OrderItemPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {
}
