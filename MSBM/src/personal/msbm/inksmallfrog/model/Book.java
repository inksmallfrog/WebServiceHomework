package personal.msbm.inksmallfrog.model;

import personal.msbm.inksmallfrog.config.Config;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.sql.Timestamp;
import java.util.Date;

/**
 * Created by inksmallfrog on 2016/10/25.
 */
@XmlRootElement(name="Book")
@XmlType(propOrder={})
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
    private Date create_time;
    private Date finished_time;

    public Book(){}

    public Book(String _name, Integer _count){
        name = _name;
        count = _count;
    }

    public Book(String _name, String _picture, String _publisher, String _ISBN,
                Double _original_price, Double _price, Double _discount, Integer _count,
                Integer _ordered_times, String _descript, Timestamp _create_time, Timestamp _finished_time){
        name = _name;
        picture = _picture;
        ISBN = _ISBN;
        original_price = _original_price;
        price = _price;
        discount = _discount;
        count = _count;
        ordered_times = _ordered_times;
        descript = _descript;
        create_time = _create_time;
        finished_time = _finished_time;
    }

    @XmlElement(type = Date.class)
    public Date getCreate_time() {
        return create_time;
    }
    @XmlElement(type = Date.class)
    public Date getFinished_time() {
        return finished_time;
    }
    @XmlElement(type = String.class)
    public String getName() {
        return name;
    }
    @XmlElement(type = int.class)
    public Integer getId() {
        return id;
    }
    @XmlElement(type = double.class)
    public Double getDiscount() {
        return discount;
    }
    @XmlElement(type = double.class)
    public Double getOriginal_price() {
        return original_price;
    }
    @XmlElement(type = double.class)
    public Double getPrice() {
        return price;
    }
    @XmlElement(type = int.class)
    public Integer getCount() {
        return count;
    }
    @XmlElement(type = int.class)
    public Integer getOrdered_times() {
        return ordered_times;
    }
    @XmlElement(type = String.class)
    public String getDescript() {
        return descript;
    }
    @XmlElement(type = String.class)
    public String getISBN() {
        return ISBN;
    }
    @XmlElement(type = String.class)
    public String getPicture() {
        return Config.HOST + picture;
    }
    @XmlElement(type = String.class)
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

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
        System.out.println(create_time.toString());
    }

    public void setFinished_time(Date finished_time) {
        this.finished_time = finished_time;
    }
}


