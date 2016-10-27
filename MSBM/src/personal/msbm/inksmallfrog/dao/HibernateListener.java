package personal.msbm.inksmallfrog.dao;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Created by inksmallfrog on 2016/10/25.
 */

public class HibernateListener implements ServletContextListener {
    public void contextInitialized(ServletContextEvent event) {
        try {
            //registering the jdbc driver here, your string to use
            //here depends on what driver you are using.
            Class.forName("com.mysql.jdbc.Driver");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        HibernateUtil.getSessionFactory(); // Just call the static initializer of that class
    }

    public void contextDestroyed(ServletContextEvent event) {
        HibernateUtil.getSessionFactory().close(); // Free all resources
    }
}
