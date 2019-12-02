import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;
/**
 * Write a description of class Library here.
 *
 * @author (2018315040 김선민, 2018315034 정철우, 2018315026 정대기, 2018315057 리얼윈 케이토)
 * @version (2019/11/28)
 */
public class Library
{
    private String name;
    private HashSet<String> borrowers; //중복 불허
    private TreeSet<Book> books; 
    private HashSet<Loan> loans; 

    public Library(String name)
    {
        this.name = name;
        borrowers = new HashSet<>();
        books = new TreeSet<>();
        loans = new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //1. 새로운 이용자를 등록한다.
    public void registerBorrower(String Name)
    {
        Borrower borrower = new Borrower(); //이용자 객체 생성
        borrower.setName(Name);

        boolean result = borrowers.add(borrower.getName()); //boolean값으로 리턴 (리턴 값이 false이면, borrowers컬렉션에 borrower객체 존재)
        if(result) //같은 객체 존재 안함
        {
            borrowers.add(borrower.getName()); //borrower객체를 borrowers 컬렉션에 추가
            System.out.println(borrower.getName() + "님이 등록되었습니다.");
        }
        else //같은 객체가 존재
        {
            System.out.println(borrower.getName() + "님은 이미 등록되어 있습니다.");
        }
        System.out.println(borrowers); //확인 출력
    }
    
    //2. 새로운 책을 등록한다.
    public void registerBook(int CatalogueNumber, String Title, String Author)
    {
        Book book = new Book(); //책 객체 생성
        book.setCatalogueNumber(CatalogueNumber);
        book.setTitle(Title);
        book.setAuthor(Author);

        boolean result = books.add(book); //boolean값으로 리턴 (리턴 값이 false이면 books에 book객체 존재)
        if(result)
        {
            books.add(book);
            System.out.println("책 '"+ book.getTitle() + "'이 추가되었습니다.");
        }
        else
        {
            System.out.println("책 '" + book.getTitle() + "'은 이미 등록되어 있는 책입니다.");
        }
        System.out.println(books);
    }
    //3. 대출 가능한 책들을 화면에 출력한다.
    public void DisplayBooksForLoan()
    {

    }

    //4. 대출 중인 책들을 화면에 출력한다.
    public void DisplayBooksOnLoan()
    {

    }

    //5. 책을 대출한다.
    public void LendOneBook(int CatalogueNumber, String Title, String Name)
    {

    }

    //6. 책을 반납한다.
    public void ReturnOneBook(int CatalogueNumber, String Title, String Name)
    {

    }

}