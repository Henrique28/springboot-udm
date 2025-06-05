package com.henrique.udm.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.henrique.udm.entities.OrderItem;
import com.henrique.udm.entities.pk.OrderItemPK;


public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
