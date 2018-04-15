package edu.monash.libraryofalexandria;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Sammy on 15/04/2018.
 */

public class BookListAdapter extends BaseAdapter{
    private Context mCurrentContext;
    private ArrayList<Book> mBookList;

    public BookListAdapter(Context con, ArrayList<Book> newBookList) {
        mCurrentContext = con;
        mBookList = newBookList;
    }

    @Override
    public int getCount() {
        return mBookList.size();
    }

    @Override
    public Object getItem(int i) {
        return mBookList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            LayoutInflater inflater = (LayoutInflater) mCurrentContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.book_list_item, null);
        }
        TextView titleView = (TextView) view.findViewById(R.id.titleView);
        TextView authorView = (TextView) view.findViewById(R.id.authorView);

        titleView.setText(mBookList.get(i).getTitle());
        authorView.setText(mBookList.get(i).getAuthor());
        return view;
    }
}
