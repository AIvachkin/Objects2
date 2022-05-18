import java.util.Objects;

public class Book {
    private final String title ;
    private final Author author ;
    private int publishingYear ;

    public Book(String title, Author author, int publishingYear) {
        this.title = title ;
        this.author = author ;
        this.publishingYear = publishingYear ;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null || getClass() != other.getClass()) return false;
        Book book = (Book) other;
        return title.equals(book.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title);
    }

    public String getTitle() {
        return this.title;
    }

    public Author getAuthor() {
        return this.author;
    }
    public int getPublishingYear() {
        return this.publishingYear ;
    }

    public void setPublishingYear(int publishingYear) {

        this.publishingYear = publishingYear;
    }

    public String toString() {
        return "'" + this.title + "', " + this.author + ", " + this.publishingYear;
    }
}
