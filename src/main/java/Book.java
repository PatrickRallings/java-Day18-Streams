public class Book {

    private final String title;
    private final String author;
    private final int pageCount;
    private final int yearPublished;



    public Book(String title, int yearPublished, int pageCount, String author) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.pageCount = pageCount;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPageCount() {
        return pageCount;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public String toString() {
        return "Title: "+getTitle()+" | Author: "+getAuthor()+" | Pages: "+getPageCount()+" | Published: "+getYearPublished();
    }
}