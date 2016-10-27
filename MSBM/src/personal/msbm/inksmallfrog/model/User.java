package personal.msbm.inksmallfrog.model;

/**
 * Created by inksmallfrog on 2016/10/25.
 */
public class User implements PersistentObject{
    private Integer id = -1;
    private String name;
    private String pwd;
    private String email;
    private String address;

    public User(){}

    public User(String _name, String _pwd, String _email, String _address){
        name = _name;
        pwd = _pwd;
        email = _email;
        address = _address;
    }

    public String getPwd() {
        return pwd;
    }

    public Integer getId() {
        return id;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
