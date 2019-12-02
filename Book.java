
/**
 * Write a description of class Book here.
 *
 * @author (2018315040 김선민, 2018315034 정철우, 2018315026 정대기, 2018315057 리얼윈 케이토)
 * @version (2019/11/28)
 */
public class Book implements Comparable<Book>
{
    private int CatalogueNumber;
    private String Title;
    private String Author;

    public int getCatalogueNumber() {
        return CatalogueNumber;
    }

    public void setCatalogueNumber(int catalogueNumber) {
        this.CatalogueNumber = catalogueNumber;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    @Override
    public int compareTo(Book anotherBook) {

        return this.getCatalogueNumber() - anotherBook.getCatalogueNumber();
    }
}
