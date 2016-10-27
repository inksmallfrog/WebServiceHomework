package personal.msbm.inksmallfrog.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import personal.msbm.inksmallfrog.model.Book;
import personal.msbm.inksmallfrog.model.Order;

import java.util.List;

/**
 * Created by inksmallfrog on 2016/10/25.
 */
public class HibernateOrderDao implements IOrderDao {
    private static HibernateOrderDao instance = new HibernateOrderDao();

    private HibernateOrderDao(){}

    public static HibernateOrderDao getInstance(){
        return instance;
    }

    @Override
    public Order get(int order_id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Order order = session.get(Order.class, order_id);
        session.close();
        return order;
    }

    @Override
    public Order add(Order order) {
        return (Order)HibernateUtil.addObject(order);
    }

    @Override
    public void delete(int order_id) {
        delete(get(order_id));
    }

    @Override
    public void delete(Order order) {
        HibernateUtil.deleteObject(order);
    }

    @Override
    public List<Order> getOrders(int user_id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List orders = (List<Order>) session.createQuery("FROM " + Order.class.getName() + " WHERE user_id=" + user_id).list();
        session.close();
        return orders;
    }

    @Override
    public List<Order> getOrdered(int book_id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List orders = (List<Order>) session.createQuery("FROM " + Order.class.getName() + " WHERE book_id=" + book_id).list();
        session.close();
        return orders;
    }
}
