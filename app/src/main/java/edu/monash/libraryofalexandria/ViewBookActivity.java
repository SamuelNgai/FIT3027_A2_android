package edu.monash.libraryofalexandria;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ViewBookActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_book);
        setTitle("View book");
    }
}
