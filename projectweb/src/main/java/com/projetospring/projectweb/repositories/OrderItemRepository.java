package com.projetospring.projectweb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetospring.projectweb.entities.OrderItem;
import com.projetospring.projectweb.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem,OrderItemPK> {

}
