import java.util.Objects;

public class Book {
    private String name;
    private Authore authore;
    private int yearPublishing;

    public Book(String name, Authore authore, int yearPublishing) {
        this.name = name;
        this.authore = authore;
        this.yearPublishing = yearPublishing;
    }

    public String getName() {
        return name;
    }

    public Authore getAuthore() {
        return authore;
    }

    public int getYearPublishing() {
        return yearPublishing;
    }

    public void setYearPublishing(int yearPublishing) {
        this.yearPublishing = yearPublishing;
    }

    @Override
    public String toString() {
        return name + " " + authore + " " + yearPublishing + " год";
    }

    @Override
    public boolean equals(Object obj) {
        if (this.getClass() !=obj.getClass()){
            return false;
        }
            Book book = (Book) obj;
            return name.equals(book.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
