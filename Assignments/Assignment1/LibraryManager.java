package Assignments.Assignment1;

//     Description
// You will create a Library Book Management System in Java. This program allows users to manage book records using classes, loops, arrays/ArrayLists, and control statements. You will use encapsulation to protect book information and loops/conditionals for user interaction.

// Create a Book class (Encapsulation & Advanced Class Components)
class Book {

        // title and author cannot be empty
        // isbn must follow a simple pattern (e.g., 10 or 13 characters)
        // displayInfo() method to print book details

    // Private fields: title (String), author (String), isbn (String), available (boolean)
    private String title = "";
    private String author = "";
    private String isbn = "";
    private boolean available = true;

    // Default constructor and parameterized constructor
    public Book (String title, String author, String isbn){
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }
    // Getters and setters with validation:
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getIsbn() { return isbn; }
    public boolean isAvailable() { return available; }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}

public class LibraryManager {

// 2.Main Program — LibraryManager.java

// Use an ArrayList to store multiple Book objects
// Provide a menu-driven interface for the user:
//                                                       1.  Add a new book

//                                                       2. Display all books

//                                                       3. Display all available books

//                                                       4 . Search books by author

//                                                       5. Check out a book (set available to false)

//                                                       6 .Return a book (set available to true)

//                                                       7 Exit

// 3.Menu Functionality (Control & Iteration)

// Use loops to continuously show the menu until the user chooses Exit
// Use if-else or switch to handle menu options
// Validate all user input using loops and conditionals

// 4.Additional Features (Arrays & ArrayLists)

// When displaying books, show the count of available vs checked-out books
// Optional: Sort the ArrayList by title before displaying
}
