package edu.monash.libraryofalexandria;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainUIActivity extends AppCompatActivity {

    private Button addBookButton;
    private Button bookListButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_ui);
        addBookButton = (Button) findViewById(R.id.addBookButton);
        bookListButton = (Button) findViewById(R.id.bookListButton);
        addBookButton.setOnClickListener(addBook);
        bookListButton.setOnClickListener(bookList);
    }

    private View.OnClickListener addBook = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent newIntent = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(newIntent);
        }
    };

    private View.OnClickListener bookList = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent newIntent = new Intent(getApplicationContext(), BookListActivity.class);
            startActivity(newIntent);
        }
    };
}
