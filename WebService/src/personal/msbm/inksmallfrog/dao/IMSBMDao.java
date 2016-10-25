package personal.msbm.inksmallfrog.dao;

/**
 * Created by inksmallfrog on 2016/10/25.
 */
public interface IMSBMDao {
    IBookDao getBookDao();
    IOrderDao getOrderDao();
    IUserDao getUserDao();
}
