package personal.msbm.inksmallfrog.model;

/**
 * Created by inksmallfrog on 2016/10/25.
 */
public class Order implements PersistentObject{
    private Integer id = -1;
    private Integer user_id;
    private Integer book_id;

    public Order(){}

    public Order(Integer _user_id, Integer _book_id){
        user_id = _user_id;
        book_id = _book_id;
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
}
