package personal.msbm.inksmallfrog.dao;

import personal.msbm.inksmallfrog.model.User;

/**
 * Created by inksmallfrog on 2016/10/25.
 */
public interface IUserDao {
    User get(int user_id);
    User get(String name);
    boolean update(User user);
    User add(String name, String pwd);
    void delete(int user_id);
    void delete(String name);
    void delete(User user);

    User tryLogin(String name, String pwd);
}
