package edu.monash.libraryofalexandria;

/**
 * Created by Samuel on 07/03/2018.
 */

public class Book {
    private String mTitle;
    private String mISBN;
    private String mAuthor;
    private String mPublisher;
    private int mEdition;
    private int mYearOfPub;
    private String mGenre;
    private String mDescription;

    public Book() {
        this.mTitle = "Untitled";
        this.mISBN = "978-3-16-148410-0";
        this.mAuthor = "No Name";
        this.mPublisher = "N/A";
        this.mEdition = 0;
        this.mYearOfPub = 2000;
        this.mGenre = "None";
        this.mDescription = "Blank";
    }

    public Book(String title, String ISBN, String author, String publisher, int edition, int yearOfPub, String genre, String description) {
        this.mTitle = title;
        this.mISBN = ISBN;
        this.mAuthor = author;
        this.mPublisher = publisher;
        this.mEdition = edition;
        this.mYearOfPub = yearOfPub;
        this.mGenre = genre;
        this.mDescription = description;
    }

    public String getTitle() {return mTitle;}
    public String getISBN() {return mISBN;}
    public String getAuthor() {return mAuthor;}
    public String getPublisher() {return mPublisher;}
    public int getEdition() {return mEdition;}
    public int getYearOfPub() {return mYearOfPub;}
    public String getGenre() {return mGenre;}
    public String getDescription() {return mDescription;}

    public void setTitle(String title) {this.mTitle = title;}
    public void setISBN(String ISBN) {this.mISBN = ISBN;}
    public void setAuthor(String author) {this.mAuthor = author;}
    public void setPublisher(String publisher) {this.mPublisher = publisher;}
    public void setEdition(int edition) {this.mEdition = edition;}
    public void setYearOfPub(int yearOfPub) {this.mYearOfPub = yearOfPub;}
    public void setGenre(String genre) {this.mGenre = genre;}
    public void setDescription(String description) {this.mDescription = description;}

    public String summary() {
        String edSuf;
        if (mEdition == 1) {
            edSuf = "st";
        }
        else if (mEdition == 2) {
            edSuf = "nd";
        }
        else if (mEdition == 3) {
            edSuf = "rd";
        }
        else {
            edSuf = "th";
        }
        return "Title: " + mTitle + "\nISBN: " + mISBN + "\nAuthor: " + mAuthor +
                "\nPublisher: " + mPublisher + "\nEdition: " + mEdition + edSuf +
                "\nYear of Publication: " + mYearOfPub + "\nGenre: " + mGenre +
                "\nDescription: " + mDescription;
    }
}
