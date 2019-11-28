import java.util.*;
/**
 * Write a description of class Library here.
 *
 * @author (2018315040 김선민, 2018315034 정철우, 2018315026 정대기, 2018315057 리얼윈 케이토)
 * @version (2019/11/28)
 */
public class Library
{
    private String name;
    private Hashset<Borrower> registeredBorrowers;
    private Treeset<Book> registeredBooks;

    public Library(String name){
        this.name = name;
    }

    public void registerOneBorrower(String name){
        Borrower borrower = new Borrower(name);
        registeredBorrwers.add(borrower);
    }

    public void regisetOneBook(String title, String author, int catalogueNumber){
        Book book = new Book(title, author, catalogueNumber);
        registeredBooks.add(book);
    }

    public void displayBooksForLoan(){

    }

    public void leadOneBook(String name, int catalogueNumber){

    }

    public void returnOneBook(int catalogueNumber){

    }
}
