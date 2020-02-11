import java.util.ArrayList;

public class Library {
    private int capacity;
    private ArrayList<Book> libraryStock;

    public Library(int capacity){
        this.capacity = capacity;
        this.libraryStock = new ArrayList<Book>();
    }

    public int getBookCount() {
        return this.libraryStock.size();
    }

    public boolean isLibraryAtCapacity(){
        return this.getBookCount() < capacity;
    }

    public void addBook(Book book1) {
        if(isLibraryAtCapacity()) {
            this.libraryStock.add(book1);
        }
    }
}
