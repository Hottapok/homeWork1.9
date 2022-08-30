public class Main {
    public static void main(String[] args) {
        Authore Tolstoi = new Authore("Лев","Толстой");
        Authore Pushkin= new Authore("Александр","Пушкин");
        Book book1=new Book("Война и мир",Tolstoi,1867);
        Book book2 =new Book("Руслан и Людмила",Pushkin,1820);
        book1.setYearPublishing(2022);
    }
}