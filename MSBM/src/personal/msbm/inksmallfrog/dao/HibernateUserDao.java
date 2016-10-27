package personal.msbm.inksmallfrog.dao;

import org.hibernate.Session;
import personal.msbm.inksmallfrog.model.User;
import personal.msbm.inksmallfrog.util.JavaEncrypter;

import java.util.List;

/**
 * Created by inksmallfrog on 2016/10/25.
 */
public class HibernateUserDao implements IUserDao {
    private static HibernateUserDao instance = new HibernateUserDao();

    private HibernateUserDao(){}

    public static HibernateUserDao getInstance(){
        return instance;
    }

    @Override
    public User get(int user_id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        User user = session.get(User.class, user_id);
        user.setPwd("");
        session.close();
        return user;
    }

    @Override
    public User get(String name) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<User> users = (List<User>) session.createQuery("FROM " + User.class.getName() + " WHERE name='" + name + "'").list();
        session.close();
        if(users.size() < 1) { return null; }
        return users.get(0);
    }

    @Override
    public boolean update(User user) {
        return HibernateUtil.updateObject(user);
    }

    @Override
    public User add(String name, String pwd) {
        String encryptedPwd = JavaEncrypter.encryptSHA(pwd);
        return (User)HibernateUtil.addObject(new User(name, encryptedPwd, "", ""));
    }

    @Override
    public void delete(int user_id) {
        delete(get(user_id));
    }

    @Override
    public void delete(String name) {
        delete(get(name));
    }

    @Override
    public void delete(User user) {
        HibernateUtil.deleteObject(user);
    }

    @Override
    public User tryLogin(String name, String pwd) {
        String encryptedPwd = JavaEncrypter.encryptSHA(pwd);
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<User> users = (List<User>) session.createQuery("FROM " + User.class.getName() + " WHERE name='" + name + "' AND pwd='" + encryptedPwd + "'").list();
        session.close();
        if(users.size() < 1) { return null; }
        return users.get(0);
    }
}
