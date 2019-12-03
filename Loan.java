
/**
 * Write a description of class Loan here.
 *
 * @author (2018315040 김선민, 2018315034 정철우, 2018315026 정대기, 2018315057 리얼윈 케이토)
 * @version (2019/11/28)
 */
public class Loan
{
    private Book book;
    private Borrower borrower;
    
    public Loan(){
        
    }
    
    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Borrower getBorrower() {
        return borrower;
    }

    public void setBorrower(Borrower borrower) {
        this.borrower = borrower;
    }
}    