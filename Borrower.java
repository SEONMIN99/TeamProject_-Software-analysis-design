import java.util.*;
/**
 * Write a description of class Borrower here.
 *
 * @author (2018315040 김선민, 2018315034 정철우, 2018315026 정대기, 2018315057 리얼윈 케이토)
 * @version (2019/11/28)
 */
public class Borrower
{
    private String name;
    private Book book;
    
    public Borrower(){
        
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Book getBook()
    {
        return book;
    }

    public void attachBook(Book book){
        this.book = book;
    }

    public void detachBook(Book book){
        this.book = null;
    }
}
