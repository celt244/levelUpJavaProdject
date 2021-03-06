package ua.dp.levelup.reflection;

/**
 * Created by java on 07.03.2017.
 */
public class Book {

    @ToXML
    private final long id;
    @ToXML
    private String bookName;

    private int pageCount;

    public String author;

    public Book(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
