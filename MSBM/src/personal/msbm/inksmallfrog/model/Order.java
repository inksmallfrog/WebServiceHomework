package personal.msbm.inksmallfrog.model;

import java.sql.Timestamp;

/**
 * Created by inksmallfrog on 2016/10/25.
 */
public class Order implements PersistentObject{
    private Integer id = -1;
    private Integer user_id;
    private Integer book_id;
    private Timestamp order_time;
    private Timestamp finished_time;

    public Order(){}

    public Order(Integer _user_id, Integer _book_id){
        user_id = _user_id;
        book_id = _book_id;
    }

    public Order(Integer _user_id, Integer _book_id, Timestamp _order_time, Timestamp _finished_time){
        user_id = _user_id;
        book_id = _book_id;
        order_time = _order_time;
        finished_time = _finished_time;
    }

    public Integer getBook_id() {
        return book_id;
    }

    public Integer getId() {
        return id;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setBook_id(Integer book_id) {
        this.book_id = book_id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public Timestamp getFinished_time() {
        return finished_time;
    }

    public void setFinished_time(Timestamp finished_time) {
        this.finished_time = finished_time;
    }

    public Timestamp getOrder_time() {
        return order_time;
    }

    public void setOrder_time(Timestamp order_time) {
        this.order_time = order_time;
    }
}
