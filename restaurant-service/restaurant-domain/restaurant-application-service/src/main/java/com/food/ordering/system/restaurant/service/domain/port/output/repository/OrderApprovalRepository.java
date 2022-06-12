package com.food.ordering.system.restaurant.service.domain.port.output.repository;

import com.food.ordering.system.restaurant.service.domain.entity.OrderApproval;

public interface OrderApprovalRepository {
    OrderApproval save(OrderApproval orderApproval);
}
