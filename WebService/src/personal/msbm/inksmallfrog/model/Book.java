package personal.msbm.inksmallfrog.model;

/**
 * Created by inksmallfrog on 2016/10/25.
 */
public class Book implements PersistentObject{
    private Integer id = -1;
    private String name;
    private String picture;
    private String publisher;
    private String ISBN;
    private Double original_price;
    private Double price;
    private Double discount;
    private Integer count;
    private Integer ordered_times;
    private String descript;

    public Book(){}

    public Book(String _name, String _picture, String _publisher, String _ISBN,
                Double _original_price, Double _price, Double _discount, Integer _count,
                Integer _ordered_times, String _descript){
        name = _name;
        picture = _picture;
        ISBN = _ISBN;
        original_price = _original_price;
        price = _price;
        discount = _discount;
        count = _count;
        ordered_times = _ordered_times;
        descript = _descript;
    }

    public String getName() {
        return name;
    }

    public Integer getId() {
        return id;
    }

    public Double getDiscount() {
        return discount;
    }

    public Double getOriginal_price() {
        return original_price;
    }

    public Double getPrice() {
        return price;
    }

    public Integer getCount() {
        return count;
    }

    public Integer getOrdered_times() {
        return ordered_times;
    }

    public String getDescript() {
        return descript;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getPicture() {
        return picture;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public void setDescript(String descript) {
        this.descript = descript;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setOrdered_times(Integer ordered_times) {
        this.ordered_times = ordered_times;
    }

    public void setOriginal_price(Double original_price) {
        this.original_price = original_price;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}
