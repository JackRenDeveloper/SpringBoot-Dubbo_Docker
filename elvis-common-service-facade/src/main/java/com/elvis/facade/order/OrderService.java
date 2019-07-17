package com.elvis.facade.order;

import com.elvis.entity.order.OrdersEntity;
import com.elvis.req.order.OrderInsertReq;
import com.elvis.req.order.OrderQueryReq;

import java.util.List;

/**
 * @Author JackRen
 * @Date 2019/07/17 上午10:59
 * @description
 */
public interface OrderService {


    List<OrdersEntity> findOrdersForBuyer(OrderQueryReq orderQueryReq, String buyerId);

    List<OrdersEntity> findOrdersForSeller(OrderQueryReq orderQueryReq, String sellerId);

    List<OrdersEntity> findOrdersForAdmin(OrderQueryReq orderQueryReq);

    String placeOrder(OrderInsertReq orderInsertReq, String buyerId);

    String pay(String orderId, String userId);

    void cancelOrder(String orderId, String userId);

    void confirmDelivery(String orderId, String expressNo, String userId);

    void confirmReceive(String orderId, String userId);

}
