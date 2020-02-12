import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book1;
    private Book book2;

    @Before
    public void before(){
        library = new Library(1);
        book1 = new Book("Ender's Game", "Orson Scott Card", "Sci-Fi");
        book2 = new Book("Crooked Kingdom", "Leigh Bardugo", "YA Fiction");
    }

    @Test
    public void canCountLibraryBooks(){
        assertEquals(0, library.getBookCount());
    }

    @Test
    public void canAddBookToLibraryCollection(){
        library.addBook(book1);
        assertEquals(1, library.getBookCount());
    }

    @Test
    public void canNotAddBookWhenLibraryAtCapacity(){
        library.addBook(book1);
        library.addBook(book2);
        assertEquals(1, library.getBookCount());
    }


}
