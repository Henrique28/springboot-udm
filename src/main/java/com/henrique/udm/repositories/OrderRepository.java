package com.henrique.udm.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.henrique.udm.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long> {

}
