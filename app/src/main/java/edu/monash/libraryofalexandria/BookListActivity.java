package edu.monash.libraryofalexandria;

import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class BookListActivity extends AppCompatActivity implements AdapterView.OnItemClickListener{

    private bookList newBookList;
    private BookListAdapter bookAdpter;
    private ListView newListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_list);
        setTitle("Book list");
        newBookList = (bookList) getApplicationContext();
        bookAdpter = new BookListAdapter(this, newBookList.getBookList());
        newListView = (ListView) findViewById(R.id.bookList);
        newListView.setAdapter(bookAdpter);
        newListView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Intent newIntent = new Intent(this, BookSummaryActivity.class);
        newIntent.putExtra("newBook", (Parcelable) newBookList.getBookList().get(i));
        startActivity(newIntent);
    }
}
