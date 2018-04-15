package edu.monash.libraryofalexandria;

import android.app.Application;

import java.util.ArrayList;

/**
 * Created by Sammy on 15/04/2018.
 */

public class bookList extends Application{
    public static ArrayList<Book> bookList;

    public bookList() {
        bookList = new ArrayList<>();
    }

    public ArrayList getBookList() {
        return bookList;
    }

    public void setBookList(ArrayList<Book> newBookList) {
        bookList = newBookList;
    }
}
