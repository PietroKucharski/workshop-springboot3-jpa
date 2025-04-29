package com.pietrokucharski.spring_project.repositories;

import com.pietrokucharski.spring_project.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
