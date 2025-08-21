public class OnlineReaderSystem {
    /*So here we want basic design of of online reading system which has the functionality
        1) User Membership creation and extension
        2) Search the database of books
        3) Reading the book
        4) Only one active user at a time
        5) Only one active book by this user

    */
    private Library library;
    private UserManager userManager;
    private Display display;
    private Book activeBook;
    private User activeUser;

    public OnlineReaderSystem()
    {
        userManager = new UserManager();
        library = new Library();
        display = new Display();
    }

    public Library getLibrary()
    {
        return library;
    }
    public UserManager getUserManager()
    {
        return userManager;
    }
    public Display getDisplay()
    {
        return display;
    }
    public Book getActiveBook()
    {
        return activeBook;
    }
    public void setActiveBook(Book book)
    {
        activeBook =book;
        display.displayBook(book);
    }
    public User getActiveUser()
    {
        return activeUser;
    }
    public void setActiveUser(User user)
    {
        activeUser = user;
        display.displayUser(user);
    }

}

