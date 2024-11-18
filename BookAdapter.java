package com.example.appdevca2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class BookAdapter extends RecyclerView.Adapter<BookAdapter.BookViewHolder> {

    private Context context;
    private List<Book> books;

    public BookAdapter(Context context, List<Book> books) {
        this.context = context;
        this.books = books;
    }

    @NonNull
    @Override
    public BookViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.book_item, parent, false);
        return new BookViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BookViewHolder holder, int position) {
        Book book = books.get(position);
        holder.bookNameText.setText(book.getName());
        holder.bookReviewText.setText(book.getReview());
        holder.bookStatusText.setText(book.getStatus());
    }

    @Override
    public int getItemCount() {
        return books.size();
    }

    static class BookViewHolder extends RecyclerView.ViewHolder {

        TextView bookNameText, bookReviewText, bookStatusText;

        public BookViewHolder(@NonNull View itemView) {
            super(itemView);
            bookNameText = itemView.findViewById(R.id.bookNameText);
            bookReviewText = itemView.findViewById(R.id.bookReviewText);
            bookStatusText = itemView.findViewById(R.id.bookStatusText);
        }
    }
}
