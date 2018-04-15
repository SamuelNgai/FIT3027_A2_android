package edu.monash.libraryofalexandria;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class BookSummaryActivity extends AppCompatActivity {

    private TextView titleView;
    private TextView isbnView;
    private TextView authorView;
    private TextView publisherView;
    private TextView editionView;
    private TextView yearOfPubView;
    private TextView genreView;
    private TextView desView;
    private Book newBook;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_summary);
        setTitle("Book summary");
        titleView = (TextView) findViewById(R.id.titleView);
        isbnView = (TextView) findViewById(R.id.isbnView);
        authorView = (TextView) findViewById(R.id.authorView);
        publisherView = (TextView) findViewById(R.id.publisherView);
        editionView = (TextView) findViewById(R.id.editionView);
        yearOfPubView = (TextView) findViewById(R.id.yearOfPubView);
        genreView = (TextView) findViewById(R.id.genreView);
        desView = (TextView) findViewById(R.id.desView);
        Intent newIntent = getIntent();
        newBook = newIntent.getParcelableExtra("newBook");

        titleView.setText(newBook.getTitle());
        isbnView.setText(newBook.getISBN());
        authorView.setText(newBook.getAuthor());
        publisherView.setText(newBook.getPublisher());
        editionView.setText(Integer.toString(newBook.getEdition()));
        yearOfPubView.setText(Integer.toString(newBook.getYearOfPub()));
        genreView.setText(newBook.getGenre());
        desView.setText(newBook.getDescription());
    }
}
