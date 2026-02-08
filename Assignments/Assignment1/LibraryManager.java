package Assignments.Assignment1;

import java.util.ArrayList;
import java.util.Scanner;

//book class
class Book {

    // Private fields: title (String), author (String), isbn (String), available (boolean)
    private String title = "";
    private String author = "";
    private String isbn = "";
    private boolean available = true;

    // Default constructor and parameterized constructor
    public Book() {
        this.title = "";
        this.author = "";
        this.isbn = "";
        this.available = true;
    }

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    // Getters and setters with validation:
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    // title and author cannot be empty
    public void setTitle(String title) {
        if (title != null && !title.trim().isEmpty()) {
            this.title = title;
        } else {
            System.out.println("Error: Title cannot be empty");
        }
    }

    public void setAuthor(String author) {
        if (author != null && !author.trim().isEmpty()) {
            this.author = author;
        } else {
            System.out.println("Error: Author cannot be empty.");
        }
    }

    // isbn must follow a simple pattern (e.g., 10 or 13 characters)
    public void setIsbn(String isbn) {
        if (isbn != null && (isbn.length() == 10 || isbn.length() == 13)) {
            this.isbn = isbn;
        } else {
            System.out.println("Error: ISBN must be 10 or 13 characters.");
        }
    }

    // displayInfo() method to print book details
    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
        System.out.println("Available: " + (available ? "Yes" : "No"));
    }
}

public class LibraryManager {

// 2.Main Program — LibraryManager.java
    public static void main(String[] args) {

        /*  Use an ArrayList to store multiple Book objects
        Provide a menu-driven interface for the user that:
        Includes adding a new book, display all books, display available books, search by author,
        checkout a book (sets to false), return a book (sets to true), exit */
        ArrayList<Book> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        int choice = 0;

        while (choice != 7) {
            System.out.println("\n==== Library Menu ====");
            System.out.println("1. Add a new book");
            System.out.println("2. Display all books");
            System.out.println("3. Display available books");
            System.out.println("4. Search books by author");
            System.out.println("5. Check out a book");
            System.out.println("6. Return a book");
            System.out.println("7. Exit menu");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                //For collecting book information
                case 1:
                    System.out.println("Enter book title: ");
                    String title = scanner.nextLine();

                    while (title.trim().isEmpty()) {
                        System.out.println("Title cannot be left empty. Enter again: ");
                        title = scanner.nextLine();
                    }

                    System.out.println("Enter author name: ");
                    String author = scanner.nextLine();

                    while (author.trim().isEmpty()) {
                        System.out.println("Author cannot be left empty. Enter again: ");
                        author = scanner.nextLine();
                    }

                    System.out.println("Enter ISBN (10 or 13 digit): ");
                    String isbn = scanner.nextLine();

                    while (!(isbn.length() == 10 || isbn.length() == 13)) {
                        System.out.print("Invalid ISBN. Must be 10 or 13 characters: ");
                        isbn = scanner.nextLine();
                    }

                    //creates and adds the book for later use
                    Book newBook = new Book(title, author, isbn);
                    books.add(newBook);

                    System.out.println("Book added successfully");
                    break;

                //if user wants to display all books currently in library
                case 2:
                    if (books.isEmpty()) {
                        System.out.println("No books to display yet.");
                        break;
                    }

                    System.out.println("\n==== All Books ====");

                    int availableBooks = 0;
                    int checkedOut = 0;

                    for (Book b : books) {
                        b.displayInfo();

                        if (b.isAvailable()) {
                            availableBooks++;
                        } else {
                            checkedOut++;
                        }
                    }

                    System.out.println("Total books: " + books.size());
                    System.out.println("Available: " + availableBooks);
                    System.out.println("Checked out: " + checkedOut);
                    break;

                //display currently available books
                case 3:
                    if (books.isEmpty()) {
                        System.out.println("No books to display yet.");
                        break;
                    }

                    System.out.println("\n==== Available Books ====");
                    int count = 0;

                    for (Book b : books) {
                        if (b.isAvailable()) {
                            b.displayInfo();
                            System.out.println("-------------");
                            count++;
                        }
                    }

                    if (count == 0) {
                        System.out.println("No available books at the moment.");
                    } else {
                        System.out.println("Total available books: " + count);
                    }

                    break;

                //search by author name
                case 4:
                    if (books.isEmpty()) {
                        System.out.println("No author information to search by in database.");
                        break;
                    }

                    while (true) {//allows user to enter a search
                        System.out.println("Enter author name to search: ");
                        String search = scanner.nextLine().trim().toLowerCase();

                        int bookMatch = 0;

                        System.out.println("==== Search Results ====");

                        for (Book b : books) {
                            String bookAuthor = b.getAuthor().toLowerCase();

                            if (bookAuthor.contains(search)) {
                                b.displayInfo();
                                bookMatch++;
                            }
                        }
                        if (bookMatch == 0) {//output if no matches found else if matches found and displays total
                            System.out.println("No books found for that author.");
                        } else {
                            System.out.println("Total matches: " + bookMatch);
                        }

                        String searchAgain = "";
                        while (!searchAgain.equals("yes") && !searchAgain.equals("no")) {
                            System.out.println("Search again? Enter yes/no: ");
                            searchAgain = scanner.nextLine().trim().toLowerCase();

                            if (!searchAgain.equals("yes") && !searchAgain.equals("no")) {
                                System.out.println("Please enter 'yes' or 'no': ");
                            }
                        }
                        if (searchAgain.equals("no")) {
                            break;
                        }
                    }
                    break;

                //Allows user to checkout a book
                case 5:
                    if (books.isEmpty()) { //default if no books in library
                        System.out.println("No books in library yet.");
                        break;
                    }

                    while (true) {
                        System.out.println("Enter a part of the book title or full title to check out: ");
                        String search = scanner.nextLine().trim().toLowerCase();

                        ArrayList<Book> matches = new ArrayList<>();

                        for (Book b : books) {
                            if (b.getTitle().toLowerCase().contains(search)) {
                                matches.add(b);
                            }
                        }

                        if (matches.isEmpty()) {
                            System.out.println("No Books found with that title.");
                            continue;
                        }

                        if (matches.size() == 1) { //if there is one match checked out already or lets you check out
                            Book b = matches.get(0);

                            if (!b.isAvailable()) {
                                System.out.println("That book has already been checked out already.");
                                continue;
                            }

                            b.setAvailable(false);
                            System.out.println("Book checked out successfully!");
                            break;
                        }

                        System.out.println("\nMultiple books found:");
                        for (int i = 0; i < matches.size(); i++) {
                            System.out.println((i + 1) + ". " + matches.get(i).getTitle());
                        }
                        int choiceNum = -1;

                        while (true) { // if multiple books are found with same part of keyword search allows user to choose by list number
                            System.out.println("Enter the number of the book to check out: ");

                            if (!scanner.hasNextInt()) {
                                System.out.println("Invalid input. Please input a number.");
                                scanner.nextLine();
                                continue;
                            }

                            choiceNum = scanner.nextInt();
                            scanner.nextLine();

                            if (choiceNum < 1 || choiceNum > matches.size()) {
                                System.out.println("Invalid choice. Enter a number the list.");
                            } else {
                                break;
                            }
                        }
                        Book selected = matches.get(choiceNum - 1);

                        if (!selected.isAvailable()) {
                            System.out.println("That book is already checked out. Choose another option!");
                            continue;
                        }

                        selected.setAvailable(false);
                        System.out.println("Book checked out successfully!");
                        break;
                    }
                    break;

                //Allows users to return books
                case 6:
                    if (books.isEmpty()) {
                        System.out.println("No books in library.");
                        break;
                    }

                    while (true) {
                        System.out.println("Enter a part of the book title to return (or type back for previous menu): ");
                        String search = scanner.nextLine().trim().toLowerCase();

                        if (search.equals("back")) { // exits the return loop and goes to search
                            break; 
                        }

                        ArrayList<Book> matches = new ArrayList<>();
                        for (Book b : books) {
                            if (b.getTitle().trim().toLowerCase().contains(search) && !b.isAvailable()) {
                                matches.add(b);
                            }
                        }

                        if (matches.isEmpty()) {
                            System.out.println("You have no books checked out under that title!");
                            continue;
                        }

                        if (matches.size() == 1) { //if there is one match checked out already or lets you return it
                            Book b = matches.get(0);

                            if (b.isAvailable()) {
                                System.out.println("That book is in the system already.");
                                continue;
                            }
                            b.setAvailable(true);
                            System.out.println("Book returned successfully!");
                            break;
                        }

                        System.out.println("\nMultiple books found: ");
                        for (int i = 0; i < matches.size(); i++) {
                            System.out.println((i + 1) + ". " + matches.get(i).getTitle());
                        }

                        int choiceNum = -1;
                        while (true) { // if multiple books are found with same part of keyword search allows user to choose by list number
                            System.out.println("Enter the number of the book to return: ");

                            if (!scanner.hasNextInt()) {
                                System.out.println("Invalid input. Please input a number.");
                                scanner.nextLine();
                                continue;
                            }

                            choiceNum = scanner.nextInt();
                            scanner.nextLine();

                            if (choiceNum < 1 || choiceNum > matches.size()) {
                                System.out.println("Invalid choice. Enter a number the list.");
                            } else {
                                break;
                            }
                        }
                        Book selected = matches.get(choiceNum - 1);

                        if (selected.isAvailable()) { // If trying to return book that is already in library
                            System.out.println("That book is already in the library. Choose another option!");
                            continue;
                        }

                        selected.setAvailable(true);
                        System.out.println("Book returned successfully!");
                        break;
                    }

                    String returnAgain = ""; //gives user option to return another or leave
                    while (!returnAgain.equals("yes") && !returnAgain.equals("no")) {
                        System.out.println("Return another book? Enter yes/no: ");
                        returnAgain = scanner.nextLine().trim().toLowerCase();

                        if (!returnAgain.equals("yes") && !returnAgain.equals("no")) {
                            System.out.println("Please enter 'yes' or 'no': ");
                        }
                    }
                    if (returnAgain.equals("no")) {
                        break;
                    }

                    break;

                //allows user to exit the program
                case 7:
                    System.out.println("Exiting Library program.");
                    break;

                //catches if invalid entry input
                default:
                    System.out.println("Invalid choice. Try again.");

            }
        }
// 3.Menu Functionality (Control & Iteration)

// Use loops to continuously show the menu until the user chooses Exit
// Use if-else or switch to handle menu options
// Validate all user input using loops and conditionals
// 4.Additional Features (Arrays & ArrayLists)
// When displaying books, show the count of available vs checked-out books
// Optional: Sort the ArrayList by title before displaying
        scanner.close();
    }
}
