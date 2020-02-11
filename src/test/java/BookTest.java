import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    private Book book1;

    @Before
    public void before(){
        book1 = new Book("Atonement", "Ian McEwan", "Tragedy");
    }

    @Test
    public void bookHasTitle(){
        assertEquals("Atonement", book1.getTitle());
    }

    @Test
    public void bookHasAuthor(){
        assertEquals("Ian McEwan", book1.getAuthor());
    }

    @Test
    public void bookHasGenre(){
        assertEquals("Tragedy", book1.getGenre());
    }
}
