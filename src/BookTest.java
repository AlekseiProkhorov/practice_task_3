public class BookTest {
    public static void run() {
        Book book = new Book("author", "book_name", 2020);
        System.out.println(book.toString());
        book.setAuthor("another_author");
        book.setName("another_book_name");
        book.setYear(1010);
        System.out.println("author = " + book.getAuthor());
        System.out.println("name = " + book.getName());
        System.out.println("year = " + book.getYear());
    }
}
