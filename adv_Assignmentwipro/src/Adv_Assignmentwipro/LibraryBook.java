package Adv_Assignmentwipro;
import java.util.*;

class Book {
    String name;

    Book(String name){
        this.name = name;
    }

    public String toString(){
        return name;
    }
}

public class LibraryBook {
    public static void main(String[] args) {

        Map<Book, Boolean> library = new HashMap<>();

        Book b1 = new Book("Java");
        Book b2 = new Book("Python");

        library.put(b1, true);
        library.put(b2, false);

        for(Book b : library.keySet()){
            System.out.println(b + " Available: " + library.get(b));
        }
    }
}