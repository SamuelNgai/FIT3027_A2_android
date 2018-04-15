package edu.monash.libraryofalexandria;

import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText title;
    private EditText isbn;
    private EditText author;
    private EditText publisher;
    private EditText edition;
    private EditText yearOfPub;
    private EditText genre;
    private EditText des;
    private Button addButton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Add new book");
        title = (EditText) findViewById(R.id.titleEdit);
        isbn = (EditText) findViewById(R.id.isbnEdit);
        author = (EditText) findViewById(R.id.authorEdit);
        publisher = (EditText) findViewById(R.id.publisherEdit);
        edition = (EditText) findViewById(R.id.editionEdit);
        yearOfPub = (EditText) findViewById(R.id.yearOfPubEdit);
        genre = (EditText) findViewById(R.id.genreEdit);
        des = (EditText) findViewById(R.id.desEdit);
        addButton = (Button) findViewById(R.id.addButton);
        addButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Book newBook = new Book(title.getText().toString(), isbn.getText().toString(), author.getText().toString(), publisher.getText().toString(), Integer.parseInt(edition.getText().toString()), Integer.parseInt(yearOfPub.getText().toString()), genre.getText().toString(), des.getText().toString());
        bookList newBookList = (bookList) this.getApplication();
        newBookList.getBookList().add(newBook);
        Intent newIntent = new Intent(this, BookSummaryActivity.class);
        newIntent.putExtra("newBook", (Parcelable) newBook);
        startActivity(newIntent);

    }
}
