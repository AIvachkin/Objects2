public class Main {
    public static void main(String[] args) {
        Author author = new Author("Лев", "Толстой") ;
//        Author author1 = new Author("Лев", "Толстой") ;

        Author author1 = new Author("Федор", "Достоевский") ;
        Book book = new Book ("Война и Мир" , author , 2001) ;
        Book book1 = new Book("Преступление и наказание", author1, 1999) ;
//        Book book1 = new Book("Война и Мир", author1, 1999) ;
        System.out.println("book = " + book);
        System.out.println("book1 = " + book1);
        System.out.println("book.hashCode() = " + book.hashCode());
        System.out.println("book1.hashCode() = " + book1.hashCode());
        System.out.println("book.equals(book1) = " + book.equals(book1));
        System.out.println("author.hashCode() = " + author.hashCode());
        System.out.println("author1.hashCode() = " + author1.hashCode());
        System.out.println("author.equals(author1) = " + author.equals(author1));

        book.setPublishingYear(1980);
        System.out.println("book.getPublishingYear() = " + book.getPublishingYear());

    }
}