import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Borrower olivia;
    private Book book1;
    private Book book2;
    private Book book3;
    private Library library;

    @Before
    public void before(){
        library = new Library(3);
        olivia = new Borrower("Olivia");
        book1 = new Book("Harry Potter and the Prisoner of Azkaban", "J.K. Rowling", "Adventure");
        book2 = new Book("To All The Boys I've Loved Before", "Jenny Han", "YA Fiction");
        book3 = new Book("The Hate You Give", "Angie Thomas", "YA Fiction");
    }

    @Test
    public void startsWithNoBooks(){
        assertEquals(0, olivia.bookCount());
    }

    @Test
    public void canAddBookToBorrowList(){

        assertEquals(1, olivia.bookCount());
    }
}
