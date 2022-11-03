package se.lexicon;

public class Book {
    
    public static int sequencer = 25647;
    private int bookId;
    private String title;
    private String author;
    private String publisher;
    
    private String bookReleaseYear;
    
    private boolean available;
    
    private Person lender;
    
    public Book(String title, String author, String publisher, String bookReleaseYear){
        this.bookId = ++sequencer;
        setTitle(title);
        this.author = author;
        this.publisher = publisher;
        this.bookReleaseYear = bookReleaseYear;
        this.available = available;
        
        this.lender = lender;
        
    }
    public String getDisplayBooks(){
        return "BookID   "  + bookId +   "Book Title    "  +  title  +  "Author   "  + author  +   "Publisher  " +   publisher +   "Release Year   "    + bookReleaseYear;
    }
    
    public String getLenderInformation() {
        if (lender != null) {
            return lender.getPersonInformation();
        } else {
            return null;
        }
    }
    
    public String getTitle() {
       
        return title;
    }

    public void setTitle(String title) {
        if(title == null)
            throw new IllegalStateException("Title pram was null");
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getBookReleaseYear() {
        return bookReleaseYear;
    }

    public void setBookReleaseYear(String bookReleaseYear) {
        this.bookReleaseYear = bookReleaseYear;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public Person getLender() {
        return lender;
    }

    public void setLender(Person lender) {
        this.lender = lender;
    }
}
