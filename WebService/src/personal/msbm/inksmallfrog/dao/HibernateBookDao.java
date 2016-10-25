package personal.msbm.inksmallfrog.dao;

import org.hibernate.Session;
import personal.msbm.inksmallfrog.model.Book;
import java.util.List;

/**
 * Created by inksmallfrog on 2016/10/25.
 */
public class HibernateBookDao implements IBookDao {
    private static HibernateBookDao instance = new HibernateBookDao();

    private HibernateBookDao(){}

    public static HibernateBookDao getInstance(){
        return instance;
    }

    @Override
    public Book get(int book_id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Book book = session.get(Book.class, book_id);
        session.close();
        return book;
    }

    @Override
    public boolean update(Book book) {
        return HibernateUtil.updateObject(book);
    }

    @Override
    public Book add(Book book) {
        return (Book) HibernateUtil.addObject(book);
    }

    @Override
    public void delete(int book_id) {
        delete(get(book_id));
    }

    @Override
    public void delete(Book book) {
        HibernateUtil.deleteObject(book);
    }

    @Override
    public List<Book> getBookList() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List books = (List<Book>) session.createQuery("FROM " + Book.class.getName()).list();
        session.close();
        return books;
    }
}
