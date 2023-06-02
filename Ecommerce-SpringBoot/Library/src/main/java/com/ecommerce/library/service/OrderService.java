package com.ecommerce.library.service;

import com.ecommerce.library.model.Order;
import com.ecommerce.library.model.ShoppingCart;

public interface OrderService {

    void saveOrder(ShoppingCart cart);

    void acceptOrder(Long id);
    void cancelOrder(Long id);
    Order getOrderById(Long id);
}
