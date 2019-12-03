import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.Iterator;
/**
 * Write a description of class Library here.
 *
 * @author (2018315040 김선민, 2018315034 정철우, 2018315026 정대기, 2018315057 리얼윈 케이토)
 * @version (2019/11/28)
 */
public class Library
{
    private String name;
    private HashSet<String> Borrowers; //중복 불허
    private TreeSet<Integer> Books; 
    private HashSet<Loan> Loans; 

    public Library(String name)
    {
        this.name = name;
        Borrowers = new HashSet<>();
        Books = new TreeSet<>();
        Loans = new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //1. 새로운 이용자를 등록한다.
    public void registerOneBorrower(String name)
    {
        Borrower borrower = new Borrower();
        borrower.setName(name);
        if(Borrowers.contains(name) == false)
        {       
            Borrowers.add(borrower.getName());

            //System.out.println(Borrowers);
            System.out.println(name + "님이 등록되었습니다.");
        }
        else
        {
            System.out.println(borrower.getName() + "님은 이미 등록되어 있습니다.");
        }
    }

    //2. 새로운 책을 등록한다.
    public void registerOneBook(int catalogueNumber, String title, String author)
    {
        Book book = new Book();
        book.setCatalogueNumber(catalogueNumber);
        book.setTitle(title);
        book.setAuthor(author);
        if(Books.contains(catalogueNumber) == false)
        {       
            Books.add(catalogueNumber);
            //System.out.println(Books);
            System.out.println(book.getTitle() + "책이 등록되었습니다.");
        }
        else
        {
            System.out.println(book.getTitle() + "책은 이미 등록되어 있습니다.");
        }
    }

    //3. 대출 가능한 책들을 화면에 출력한다.
    public void DisplayBooksForLoan()
    {
        Iterator iter = Books.iterator();
        while(iter.hasNext()){
            Book book = (Book)iter.next();
            if((book.getBorrower()) == null){
                book.display();
            }
            else{
                
            }
        }

    }

    //4. 대출 중인 책들을 화면에 출력한다.
    public void DisplayBooksOnLoan()
    {
        Iterator iter = Books.iterator();
        while(iter.hasNext()){
            Book book = (Book)iter.next();
            if((book.getBorrower()) == null){
                
            }
            else{
                book.display();
            }
        }
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