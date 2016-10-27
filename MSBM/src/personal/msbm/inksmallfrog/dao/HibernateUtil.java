package personal.msbm.inksmallfrog.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import personal.msbm.inksmallfrog.model.PersistentObject;
import personal.msbm.inksmallfrog.model.User;

public class HibernateUtil {

    private static SessionFactory sessionFactory;

    static{
        try {
            sessionFactory = new Configuration().configure().buildSessionFactory();
        } catch (Throwable e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static SessionFactory getSessionFactory(){
        return sessionFactory;
    }

    public static PersistentObject addObject(PersistentObject object){
        Session session = sessionFactory.openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            object.setId((Integer) session.save(object));
            tx.commit();
        }catch (HibernateException e){
            if(tx != null) { tx.rollback(); }
            System.out.println(e.getCause().getMessage());
            return null;
        }finally {
            session.close();
        }
        return object;
    }

    public static void deleteObject(Object object){
        Session session = sessionFactory.openSession();
        Transaction tx = null;
        try{
            tx = session.beginTransaction();
            session.delete(object);
            tx.commit();
        }catch (HibernateException e){
            if(tx != null) { tx.rollback(); }
            e.printStackTrace();
        }finally {
            session.close();
        }
    }

    public static boolean updateObject(Object object){
        Session session = sessionFactory.openSession();
        Transaction tx = null;
        boolean res = true;
        try{
            tx = session.beginTransaction();
            session.update(object);
            tx.commit();
        }catch (HibernateException e){
            if(tx != null) { tx.rollback(); }
            e.printStackTrace();
            res = false;
        }finally {
            session.close();
        }
        return res;
    }

    public static void shutDown(){
        //closes caches and connections
        getSessionFactory().close();
    }
}
