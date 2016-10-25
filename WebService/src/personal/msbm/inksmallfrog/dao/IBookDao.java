package personal.msbm.inksmallfrog.dao;

import personal.msbm.inksmallfrog.model.Book;

import java.util.List;

/**
 * Created by inksmallfrog on 2016/10/25.
 */
public interface IBookDao {
    Book get(int book_id);
    boolean update(Book book);
    Book add(Book book);
    void delete(int book_id);
    void delete(Book book);

    List<Book> getBookList();
}
