package personal.msbm.inksmallfrog.dao;

import personal.msbm.inksmallfrog.model.Order;

import java.util.List;

/**
 * Created by inksmallfrog on 2016/10/25.
 */
public interface IOrderDao {
    Order get(int order_id);
    Order add(Order order);
    void delete(int order_id);
    void delete(Order order);
    List<Order> getOrders(int user_id);
    List<Order> getOrdered(int book_id);
}
