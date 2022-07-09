package com.example.system.order.service.entity;


import com.example.system.domain.entity.AggregateRoot;
import com.example.system.domain.valueobject.CustomerId;
import com.example.system.domain.valueobject.OrderId;
import com.example.system.domain.valueobject.RestaurantId;
import com.example.system.order.service.valueobject.StreetAddress;

public class Order extends AggregateRoot<OrderId> {

    private CustomerId customerId;
    private RestaurantId restaurantId;
    private StreetAddress streetAddress;

}
