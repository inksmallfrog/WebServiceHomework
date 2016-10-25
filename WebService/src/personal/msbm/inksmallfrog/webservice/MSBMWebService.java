package personal.msbm.inksmallfrog.webservice;

import com.sun.xml.ws.transport.http.servlet.WSServletContextListener;
import personal.msbm.inksmallfrog.dao.HibernateMSBMDao;
import personal.msbm.inksmallfrog.dao.IMSBMDao;
import personal.msbm.inksmallfrog.model.Book;
import personal.msbm.inksmallfrog.model.Order;
import personal.msbm.inksmallfrog.model.User;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by inksmallfrog on 2016/10/25.
 *
 * This file defines the API that this webService can support for MSBM
 */

@WebService
public class MSBMWebService {
    IMSBMDao dao = new HibernateMSBMDao();

    public static void main(String[] args){
        IMSBMDao dao = new HibernateMSBMDao();
        dao.getUserDao().delete("inks");
        dao.getUserDao().add("inks", "aabbcc");
    }
    
    @WebMethod
    public User getUserLog(String name, String pwd){
        return dao.getUserDao().tryLogin(name, pwd);
    }

    @WebMethod
    public List<Book> getBookList(){
        return dao.getBookDao().getBookList();
    }

    @WebMethod
    public boolean orderBookWithLogged(int userId, int bookId){
        return dao.getOrderDao().add(new Order(userId, bookId)).getId() != -1;
    }

    @WebMethod
    public boolean orderBookWithoutLogged(String email, int bookId){
        return false;
    }
}
