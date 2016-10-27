package personal.msbm.inksmallfrog.dao;

/**
 * Created by inksmallfrog on 2016/10/25.
 */
public class HibernateMSBMDao implements IMSBMDao {

    @Override
    public IBookDao getBookDao() {
        return HibernateBookDao.getInstance();
    }

    @Override
    public IOrderDao getOrderDao() {
        return HibernateOrderDao.getInstance();
    }

    @Override
    public IUserDao getUserDao() {
        return HibernateUserDao.getInstance();
    }
}
