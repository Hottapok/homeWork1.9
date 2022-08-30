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

}
